import os.path


root_src_dir_path = os.path.join(os.path.dirname(__file__), '..', 'src')
include_src_dir_path = os.path.join(root_src_dir_path, 'dressdiscover', 'vocabularies')

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
            out_file_lines.append(file_line)
        if len(out_file_lines[-1]) > 0:
            out_file_lines.append("")
        with open(file_path, 'wb') as f:
            f.write("\n".join(out_file_lines))
