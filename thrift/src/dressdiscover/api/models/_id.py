from waf.api.models._string_model_id import _StringModelId


class _Id(_StringModelId):
    def java_repr(self):
        return ''
