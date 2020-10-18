from dressdiscover_etl.transformers.costume_core_property_extractor import (
    CostumeCorePropertyExtractor,
)

descriptions = (
    """\
Dress (a) of cream rayon moire faille; above-knee length skirt with single pleat in center back; two-piece tailored sleeve; no waistline, half-belt at center back waist with two plastic four-leaf clover buttons; princess seam torso; mandarin style collar. Shoes (b&c): Low-heel; cream-colored satin; buckle detail on top; 2 oval cutouts by toe with two rows of rhinestones in between; burnt septia leather sole, 2.25" heel, square toe.""",
    """\
Dress of sheer ivory cotton batiste: boatneck; cap sleeves; dropped waist with skirt gathered and hand sewn to waistline at sides; mid calf length; metal hook and eye closures; inserted lace panels from neckline to hemline at center front and center back; lace panel trim along entire hemline; self bias tape hand sewn to edges of neck and sleeves; vertical lace panels machine stitched; hand embroidered flowers. Worn in 1925 for the Daisy Chain at Vassar Commencement by Kathryn Keeler Sherrill VC '27.""",
)


def test_extract():
    try:
        sut = CostumeCorePropertyExtractor()
    except ImportError:
        return

    for description in descriptions:
        properties = sut.extract_properties(description)
        assert properties is not None
        assert len(properties)
        # print(properties)
