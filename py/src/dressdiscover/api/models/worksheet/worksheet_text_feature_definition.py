class WorksheetTextFeatureDefinition(object):
    class Builder(object):
        def build(self):
            return WorksheetTextFeatureDefinition()

    def __eq__(self, other):
        return True

    def __iter__(self):
        return iter(tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        return 'WorksheetTextFeatureDefinition()'

    def __str__(self):
        return 'WorksheetTextFeatureDefinition()'

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition
        '''

        iprot.read_struct_begin()
        iprot.read_struct_end()
        return cls()

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.api.models.worksheet.worksheet_text_feature_definition.WorksheetTextFeatureDefinition
        '''

        oprot.write_struct_begin('WorksheetTextFeatureDefinition')

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
