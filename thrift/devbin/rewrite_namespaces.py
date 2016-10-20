import os.path


root_src_dir_path = os.path.join(os.path.dirname(__file__), '..', 'src')
include_src_dir_path = os.path.join(root_src_dir_path, 'dressdiscover', 'vocabularies')


subdir_mappings = {}
for root_dir_path, subdir_names, _ in os.walk(root_src_dir_path):
    for subdir_name in subdir_names:
        subdir_path = os.path.join(root_dir_path, subdir_name)
        if not subdir_path.startswith(include_src_dir_path):
            continue
        root_dir_name = os.path.split(root_dir_path)[1]
        if not root_dir_name in ('costume_core', 'vra_core'):
            continue
        subdir_mappings[subdir_name] = root_dir_name

for root_dir_path, _, file_names in os.walk(root_src_dir_path):
    for file_name in file_names:
        file_path = os.path.join(root_dir_path, file_name)
        if not file_path.startswith(include_src_dir_path):
            continue
        with open(file_path, 'rb') as f:
            in_file_lines = f.readlines()
        out_file_lines = []
        for file_line in in_file_lines:
            file_line = file_line.rstrip()
            if len(file_line) == 0:
                pass
            elif file_line.startswith('namespace bean_java'):
                continue
            elif file_line.startswith('namespace java'):
                continue
            elif file_line.startswith('namespace * dressdiscover.api.models.'):
                head, tail = file_line.rsplit('.', 1)
                file_line = "namespace * dressdiscover.vocabularies.%s.%s" % (subdir_mappings[tail], tail)
            elif file_line == 'include "dressdiscover/api/models/vocab.thrift"':
                file_line = 'include "dressdiscover/vocabularies/vra_core/vocab.thrift"'
            elif file_line == 'include "dressdiscover/api/models/vocab_ref.thrift"':
                file_line = 'include "dressdiscover/vocabularies/vra_core/vocab_ref.thrift"'
            elif file_line.startswith('include "dressdiscover/api/models/'):
                split = file_line.split('/')
                try:
                    file_line = 'include "dressdiscover/vocabularies/%s/%s/%s' % (subdir_mappings[split[-2]], split[-2], split[-1])
                except KeyError:
                    print split
            out_file_lines.append(file_line)
        if len(out_file_lines[-1]) > 0:
            out_file_lines.append("")
        with open(file_path, 'wb') as f:
            f.write("\n".join(out_file_lines))
