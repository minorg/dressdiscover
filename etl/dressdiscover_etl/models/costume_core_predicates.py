from .costume_core_predicate import CostumeCorePredicate

alternative = CostumeCorePredicate(
    description_text_en="Any additional titles by which the item is known, other than the preferred title, including nicknames or titles in other languages.",
    display_name_en="Alternative Title",
    id="alternative",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/alternative",
    terms=None,
)
cataloguerWithDate = CostumeCorePredicate(
    description_text_en="Full names of all catalogers, with the date in parentheses, in the format YYYY-MM-DD.\n\nWhen additions are made to the catalog record, additional names and dates should be added and existing entries should not be deleted.",
    display_name_en="Cataloguer With Date",
    id="cataloguerWithDate",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/cataloguerWithDate",
    terms=None,
)
cbLengthIn = CostumeCorePredicate(
    description_text_en="The center back measurement from top edge (neckline or waist) to hem, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Center Back Length",
    id="cbLengthIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/cbLengthIn",
    terms=None,
)
cfLengthIn = CostumeCorePredicate(
    description_text_en="The center front measurement from top edge (neckline or waist) to hem, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Center Front Length",
    id="cfLengthIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/cfLengthIn",
    terms=None,
)
chestIn = CostumeCorePredicate(
    description_text_en="The measurement straight around the fullest part of the chest, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Chest",
    id="chestIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/chestIn",
    terms=None,
)
classification = CostumeCorePredicate(
    description_text_en='A classification term should be applied for all costume items, such as "Costume," or "Fashion." This may vary based on the larger overall collection in which these objects will be published.',
    display_name_en="Classification",
    id="classification",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/classification",
    terms=None,
)
closure = CostumeCorePredicate(
    description_text_en="Each closure used on the garment.",
    display_name_en="Closure",
    id="closure",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/closure",
    terms=None,
)
closurePlacement = CostumeCorePredicate(
    description_text_en="Each placement of closures on the item.",
    display_name_en="Closure Placement",
    id="closurePlacement",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/closurePlacement",
    terms=None,
)
collar = CostumeCorePredicate(
    description_text_en="Each term that describes the collar of the garment.",
    display_name_en="Collar",
    id="collar",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/collar",
    terms=None,
)
colorMain = CostumeCorePredicate(
    description_text_en="The most dominant color in the garment.",
    display_name_en="Color Main",
    id="colorMain",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/colorMain",
    terms=None,
)
colorSecondary = CostumeCorePredicate(
    description_text_en="Any additional colors in the garment.",
    display_name_en="Color Secondary",
    id="colorSecondary",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/colorSecondary",
    terms=None,
)
condition = CostumeCorePredicate(
    description_text_en="A single term to indicate a rating of the overall condition of the object.",
    display_name_en="Condition Term",
    id="condition",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/condition",
    terms=None,
)
conditionDescription = CostumeCorePredicate(
    description_text_en="Narrative description of the overall physical condition, characteristics, and completeness of a work, describing where each issue is located on the garment. \n\nThis may incorporate details checked off on a separate worksheet.",
    display_name_en="Condition Description",
    id="conditionDescription",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/conditionDescription",
    terms=None,
)
costOriginal = CostumeCorePredicate(
    description_text_en="The cost of the object when originally created, indicating the units (dollars, etc.)",
    display_name_en="Cost Original",
    id="costOriginal",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/costOriginal",
    terms=None,
)
costumeComponents = CostumeCorePredicate(
    description_text_en="Each additional component of the garment not included elsewhere.",
    display_name_en="Costume Components",
    id="costumeComponents",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/costumeComponents",
    terms=None,
)
creator = CostumeCorePredicate(
    description_text_en="Full name of each known designer, maker, manufacturer, etc. \n\nUse the display form with first name first, not last name first.",
    display_name_en="Creator",
    id="creator",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/creator",
    terms=None,
)
culturalContext = CostumeCorePredicate(
    description_text_en="The name(s) of the culture, people, or nationality from which the work originated or was used.\n",
    display_name_en="Culture",
    id="culturalContext",
    sub_property_of_uri=None,
    uri="http://purl.org/vra/culturalContext",
    terms=None,
)
date = CostumeCorePredicate(
    description_text_en='If known, the year in which the item was created. Otherwise, a range of years that it could possibly have been created, from the earliest to latest. A more precise date can be entered if known, as YYYY-MM or YYYY-MM-DD. Uncertainty can be indicated in parentheses after the date or range of dates (for example, "(circa)").\n\nFollow ISO 8601 standards for initial numbers and follow with additional display terms.',
    display_name_en="Date",
    id="date",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/date",
    terms=None,
)
description = CostumeCorePredicate(
    description_text_en='Use the details from each component section of the data entry process to construct the full description for display. \n\nStart with one sentence that sums up the work type(s), colors, and important features. \n\nFollow with a description of materials and notable techniques, separated by commas. \n\nThe next sentences list each component with an ID number or letter in parentheses, ex. "bodice (a)", with structural details separated by commas (in order from the top down, outside in). This is the place to describe where particular materials or techniques are located on the garment.\n\nCopy from Description Autofill if available (as values) and edit as needed.',
    display_name_en="Description",
    id="description",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/description",
    terms=None,
)
dimensionsOther = CostumeCorePredicate(
    description_text_en="Any other measurements that are notable on this garment, in inches, as decimals to the nearest quarter inch. Describe what the measurement is of, in parentheses, after the measurement.",
    display_name_en="Measurements Other",
    id="dimensionsOther",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/dimensionsOther",
    terms=None,
)
donator = CostumeCorePredicate(
    description_text_en='Full name(s) of all donors. To protect the privacy of some private donors, they may request that this read simply "Anonymous" with no specifics. Instead, the specifics can be entered under "private information."',
    display_name_en="Donor",
    id="donator",
    sub_property_of_uri=None,
    uri="http://purl.org/vra/donator",
    terms=None,
)
dressType = CostumeCorePredicate(
    description_text_en="Each term that describes the type of dress.",
    display_name_en="Dress Type",
    id="dressType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/dressType",
    terms=None,
)
endDate = CostumeCorePredicate(
    description_text_en="The latest the garment could have been made, in the format YYYY or YYYY-MM or YYYY-MM-DD. Follow ISO 8601 standards.",
    display_name_en="Date Latest",
    id="endDate",
    sub_property_of_uri=None,
    uri="http://purl.org/vra/endDate",
    terms=None,
)
exhibitions = CostumeCorePredicate(
    description_text_en="A list of all exhibitions that included this object,  including the title or name of each exhibition, its location, and other pertinent information.",
    display_name_en="Exhibitions",
    id="exhibitions",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/exhibitions",
    terms=None,
)
extent = CostumeCorePredicate(
    description_text_en="Use each separate measurement recorded in the data entry process to construct the full list of measurements for display.\n\nList all measurements of the item, separated by commas. Measurements should be in inches, to the nearest .25 inch. Describe the part being measured in parentheses.",
    display_name_en="Measurements Display",
    id="extent",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/extent",
    terms=None,
)
fiber = CostumeCorePredicate(
    description_text_en="Each term for the type of fiber used in the materials of the object, distinguished from the textile type, trimmings, or other materials.",
    display_name_en="Fiber",
    id="fiber",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/fiber",
    terms=None,
)
function = CostumeCorePredicate(
    description_text_en="Each function for which the object was worn. ",
    display_name_en="Function",
    id="function",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/function",
    terms=None,
)
gender = CostumeCorePredicate(
    description_text_en="The gender for which the object was originally intended.",
    display_name_en="Gender",
    id="gender",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/gender",
    terms=None,
)
hasInscription = CostumeCorePredicate(
    description_text_en="The exact text, in quotes, from each label within the object, followed by a phrase describing where the label is located on the object.",
    display_name_en="Label",
    id="hasInscription",
    sub_property_of_uri=None,
    uri="http://purl.org/vra/hasInscription",
    terms=None,
)
hasTechnique = CostumeCorePredicate(
    description_text_en="Each process involved in making the object. \n\nDo not include a description of where the technique is in evidence on the garment: that should be a part of the narrative description.",
    display_name_en="Technique",
    id="hasTechnique",
    sub_property_of_uri="http://purl.org/vra/hasTechnique",
    uri="https://w3id.org/costumeCore/ontology/hasTechnique",
    terms=None,
)
hemCircumferenceIn = CostumeCorePredicate(
    description_text_en="The measurement all around the hem, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Hem Circumference",
    id="hemCircumferenceIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/hemCircumferenceIn",
    terms=None,
)
hipsIn = CostumeCorePredicate(
    description_text_en="The measurement straight around the fullest part of the hips, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Hips",
    id="hipsIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/hipsIn",
    terms=None,
)
icomType = CostumeCorePredicate(
    description_text_en="The second and third level classes from the ICOM Vocabulary.",
    display_name_en="ICOM Type",
    id="icomType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/icomType",
    terms=None,
)
identifier = CostumeCorePredicate(
    description_text_en="A unique ID number for the item. This will often be formatted like VC1992124 (VC=repository, 1992 = year, 124 = serial number).\n\nNo spaces or uncommon characters.",
    display_name_en="Identifier",
    id="identifier",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/identifier",
    terms=None,
)
isReferencedBy = CostumeCorePredicate(
    description_text_en="References about this object, or about similar objects in texts or online, as either a full bibliographic citation (in MLA format) or a URL.",
    display_name_en="References",
    id="isReferencedBy",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/isReferencedBy",
    terms=None,
)
length = CostumeCorePredicate(
    description_text_en="Each length of the object, where the hem lands on the body.",
    display_name_en="Length",
    id="length",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/length",
    terms=None,
)
lifeStages = CostumeCorePredicate(
    description_text_en="Each age of the wearer for which the object was intended.",
    display_name_en="Life Stages",
    id="lifeStages",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/lifeStages",
    terms=None,
)
liturgicalType = CostumeCorePredicate(
    description_text_en="Each type of liturgical garment or accessory.",
    display_name_en="Liturgical Type",
    id="liturgicalType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/liturgicalType",
    terms=None,
)
mannequin = CostumeCorePredicate(
    description_text_en="The size and year, or name, of any mannequins the garment fits on for display.",
    display_name_en="Mannequin",
    id="mannequin",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/mannequin",
    terms=None,
)
material = CostumeCorePredicate(
    description_text_en="Each material in the object.",
    display_name_en="Material",
    id="material",
    sub_property_of_uri="http://purl.org/vra/material",
    uri="https://w3id.org/costumeCore/ontology/material",
    terms=None,
)
neckline = CostumeCorePredicate(
    description_text_en="Each type of neckline of the garment.",
    display_name_en="Neckline",
    id="neckline",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/neckline",
    terms=None,
)
otherMaterials = CostumeCorePredicate(
    description_text_en="Any other material terms that do not describe fibers, textiles, or trimmings.",
    display_name_en="Other Materials",
    id="otherMaterials",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/otherMaterials",
    terms=None,
)
pantsType = CostumeCorePredicate(
    description_text_en="Each term that describes the length and shape of pants.",
    display_name_en="Pants Type",
    id="pantsType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/pantsType",
    terms=None,
)
pattern = CostumeCorePredicate(
    description_text_en="Each design motif appearing on the object.",
    display_name_en="Pattern",
    id="pattern",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/pattern",
    terms=None,
)
placeOfRepository = CostumeCorePredicate(
    description_text_en="The name of the collection the garment belongs to, institutional or private. Include the address of a public institution, if appropriate. \n\nTo protect the privacy of some private collectors, they may request that this read simply 'Private Collection' with no specifics. Instead, the specifics can be entered under 'private information.'",
    display_name_en="Holding Institution",
    id="placeOfRepository",
    sub_property_of_uri=None,
    uri="http://purl.org/vra/placeOfRepository",
    terms=None,
)
privateInformation = CostumeCorePredicate(
    description_text_en="Any information that doesn't fit elsewhere, and isn't suited for public view (for example private stories or communication with the donor).",
    display_name_en="Private Information",
    id="privateInformation",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/privateInformation",
    terms=None,
)
publicInformation = CostumeCorePredicate(
    description_text_en="A brief narrative about the object, with any interesting / important information (numbers in parentheses can provide links to external references, which then are also listed in reference field).\n\nInclude MLA style parenthetical citations to references listed in References field as needed.",
    display_name_en="Public Information",
    id="publicInformation",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/publicInformation",
    terms=None,
)
relation = CostumeCorePredicate(
    description_text_en="Enter the identifier for any related items. For clothing artifacts this will be an ID# like VC1992124. For other relations, such as exhibitions, the identifier may take a different form, such as the title. See the identifier element in the item itself to check.",
    display_name_en="Relation",
    id="relation",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/relation",
    terms=None,
)
rights = CostumeCorePredicate(
    description_text_en="A standardized rights statement. In most cases, clothing artifacts are not protected by copyright, but may be represented in images that are under copyright.",
    display_name_en="Rights",
    id="rights",
    sub_property_of_uri="http://purl.org/dc/terms/rights",
    uri="https://w3id.org/costumeCore/ontology/rights",
    terms=None,
)
rightsHolder = CostumeCorePredicate(
    description_text_en="A rights statement including what is covered (images or object itself), person or organization owning or managing rights, a copyright symbol and date if appropriate, and additional contact information. ",
    display_name_en="Rights Holder",
    id="rightsHolder",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/rightsHolder",
    terms=None,
)
size = CostumeCorePredicate(
    description_text_en="The size of the object, if shown on a label or otherwise identified.",
    display_name_en="Size",
    id="size",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/size",
    terms=None,
)
skirtType = CostumeCorePredicate(
    description_text_en="Each term that describes the skirt of the garment.",
    display_name_en="Skirt Type",
    id="skirtType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/skirtType",
    terms=None,
)
sleeveLength = CostumeCorePredicate(
    description_text_en="Each term that describes the length of the sleeves of the garment.",
    display_name_en="Sleeve Length",
    id="sleeveLength",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/sleeveLength",
    terms=None,
)
sleeveType = CostumeCorePredicate(
    description_text_en="Each term that describes the shape of the sleeves of the garment.",
    display_name_en="Sleeve Type",
    id="sleeveType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/sleeveType",
    terms=None,
)
socioEconomicClass = CostumeCorePredicate(
    description_text_en="Each term that indicates the socioeconomic class of the person(s) who wore the object. This can have multiple values to show that the object was passed up or down through different classes.",
    display_name_en="Socio Economic Class",
    id="socioEconomicClass",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/socioEconomicClass",
    terms=None,
)
spatial = CostumeCorePredicate(
    description_text_en="Where the item was originally made, if known; with all levels such as city, county, state, country, each as a separate entry.",
    display_name_en="Region",
    id="spatial",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/spatial",
    terms=None,
)
startDate = CostumeCorePredicate(
    description_text_en="The earliest the garment could have been made, in the format YYYY or YYYY-MM or YYYY-MM-DD. Follow ISO 8601 standards.",
    display_name_en="Date Earliest",
    id="startDate",
    sub_property_of_uri=None,
    uri="http://purl.org/vra/startDate",
    terms=None,
)
storageLocation = CostumeCorePredicate(
    description_text_en='Where the garment has been put away in storage, for example by shelf section, ex. "C4"',
    display_name_en="Storage Location",
    id="storageLocation",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/storageLocation",
    terms=None,
)
subject = CostumeCorePredicate(
    description_text_en='All costume artifacts should have the subject "Costume" or "Clothing and Dress." ',
    display_name_en="Subject",
    id="subject",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/subject",
    terms=None,
)
temporal = CostumeCorePredicate(
    description_text_en='Each decade (or longer fashion style periods) in which the object was made or used. \n\nDo not include an apostrophe in a decade name; just add an "s," like "1950s."',
    display_name_en="Style Period",
    id="temporal",
    sub_property_of_uri="http://purl.org/dc/terms/temporal",
    uri="https://w3id.org/costumeCore/ontology/temporal",
    terms=None,
)
textileMaterials = CostumeCorePredicate(
    description_text_en="Each term for materials produced from component fibers, distinguished from the fibers, trimmings, or other materials.",
    display_name_en="Textile Materials",
    id="textileMaterials",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/textileMaterials",
    terms=None,
)
title = CostumeCorePredicate(
    description_text_en="For costume artifacts that have not been titled by the original maker, this should be a descriptive phrase with about 3 important details, usually color, function, work type, or a notable detail.\n\nIn title case, less than 100 characters.",
    display_name_en="Title",
    id="title",
    sub_property_of_uri=None,
    uri="http://purl.org/dc/terms/title",
    terms=None,
)
treatment = CostumeCorePredicate(
    description_text_en="All procedures that have been completed to repair, conserve, stabilize, or display an object, in a narrative paragraph.",
    display_name_en="Treatment",
    id="treatment",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/treatment",
    terms=None,
)
trimming = CostumeCorePredicate(
    description_text_en="Each term for decorative material added to an object, distinguished from the fibers, textile type,  or other materials.",
    display_name_en="Trimming",
    id="trimming",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/trimming",
    terms=None,
)
type = CostumeCorePredicate(
    description_text_en='All clothing objects will have DCMI type "Physical Object." ',
    display_name_en="Type",
    id="type",
    sub_property_of_uri="http://purl.org/dc/terms/type",
    uri="https://w3id.org/costumeCore/ontology/type",
    terms=None,
)
underarmToWaistIn = CostumeCorePredicate(
    description_text_en="The measurement from armpit to waist at the side seam, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Underarm To Waist",
    id="underarmToWaistIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/underarmToWaistIn",
    terms=None,
)
waistIn = CostumeCorePredicate(
    description_text_en="The measurement straight around the narrowest part of the waist, in inches, as decimals to the nearest quarter inch.",
    display_name_en="Waist",
    id="waistIn",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/waistIn",
    terms=None,
)
waistline = CostumeCorePredicate(
    description_text_en="Each term that describes the level and shape of the waist of the garment.",
    display_name_en="Waistline",
    id="waistline",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/waistline",
    terms=None,
)
workType = CostumeCorePredicate(
    description_text_en="Each top-level work type of the object. More specific terms are possible as sub-categories, in other fields, or can be included in the description.",
    display_name_en="Work Type",
    id="workType",
    sub_property_of_uri=None,
    uri="https://w3id.org/costumeCore/ontology/workType",
    terms=None,
)
wornBy = CostumeCorePredicate(
    description_text_en="Full name(s) of anyone known to have worn a costume artifact.",
    display_name_en="Worn by",
    id="wornBy",
    sub_property_of_uri="http://www.wikidata.org/entity/P7376",
    uri="https://w3id.org/costumeCore/ontology/wornBy",
    terms=None,
)
COSTUME_CORE_PREDICATES = (
    alternative,
    cataloguerWithDate,
    cbLengthIn,
    cfLengthIn,
    chestIn,
    classification,
    closure,
    closurePlacement,
    collar,
    colorMain,
    colorSecondary,
    condition,
    conditionDescription,
    costOriginal,
    costumeComponents,
    creator,
    culturalContext,
    date,
    description,
    dimensionsOther,
    donator,
    dressType,
    endDate,
    exhibitions,
    extent,
    fiber,
    function,
    gender,
    hasInscription,
    hasTechnique,
    hemCircumferenceIn,
    hipsIn,
    icomType,
    identifier,
    isReferencedBy,
    length,
    lifeStages,
    liturgicalType,
    mannequin,
    material,
    neckline,
    otherMaterials,
    pantsType,
    pattern,
    placeOfRepository,
    privateInformation,
    publicInformation,
    relation,
    rights,
    rightsHolder,
    size,
    skirtType,
    sleeveLength,
    sleeveType,
    socioEconomicClass,
    spatial,
    startDate,
    storageLocation,
    subject,
    temporal,
    textileMaterials,
    title,
    treatment,
    trimming,
    type,
    underarmToWaistIn,
    waistIn,
    waistline,
    workType,
    wornBy,
)
