from typing import Optional


def quote_repr_string(value: Optional[str]):
    if value is None:
        return None
    return "\"" + value.replace('"', r'\"') + "\""
