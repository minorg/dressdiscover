from pathlib import Path

DATA_DIR_PATH = Path(__file__).parent.parent.parent.parent.parent.absolute() / "data"
assert DATA_DIR_PATH.is_dir(), DATA_DIR_PATH
