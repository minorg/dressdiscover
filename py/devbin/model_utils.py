from datetime import datetime

from costume.api.models.model_metadata import ModelMetadata


def get_nonempty_string(dict_, key):
    value = dict_.get(key)
    if value is None:
        return None
    elif len(value) == 0:
        return None
    return value


def new_model_metadata():
    datetime_now = datetime.now()
    return ModelMetadata.Builder().set_ctime(datetime_now).set_mtime(datetime_now).build()

