package net.lab1318.costume.gui.models.wizard;

import com.google.common.collect.ImmutableMap;

public final class CostumeCore {
    public interface Feature {
        public String getDisplayName();

        public String name();
    }

    public enum ClosurePlacement implements Feature {
        CENTER_BACK("center back"),
        CENTER_FRONT("center front"),
        DOUBLE_BREASTED("double-breasted"),
        NECK("neck"),
        OFF_CENTER_BACK("off-center back"),
        OFF_CENTER_FRONT("off-center front"),
        SIDE("side");

        public final String getDisplayName() {
            return displayName;
        }

        private ClosurePlacement(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum ClosureType implements Feature {
        BUTTONS("buttons"),
        CENTER_BACK("center back"),
        CENTER_FRONT("center front"),
        DOUBLE_BREASTED("double-breasted"),
        HOOKS_AND_EYES("hooks and eyes"),
        NECK("neck"),
        OFF_CENTER_BACK("off-center back"),
        OFF_CENTER_FRONT("off-center front"),
        SIDE("side"),
        SNAPS("snaps"),
        TIES("ties"),
        TOGGLES("toggles"),
        VELCRO("velcro"),
        ZIPPER("zipper");

        public final String getDisplayName() {
            return displayName;
        }

        private ClosureType(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum Material implements Feature {
        ACETATE("acetate"),
        ACRYLIC("acrylic"),
        ANGORA("angora"),
        BASKET_WEAVE("basket weave"),
        BROCADE("brocade"),
        CAMEL("camel"),
        CASHMERE("cashmere"),
        CHIFFON("chiffon"),
        COTTON("cotton"),
        CROCHET("crochet"),
        DAMASK("damask"),
        DOBBY_WEAVE("dobby weave"),
        DOUBLE_WEAVE("double-weave"),
        FELT("felt"),
        FIBER_BLEND("fiber blend"),
        GEORGETTE("georgette"),
        GLASS("glass"),
        HEMP("hemp"),
        JACQUARD("jacquard"),
        KNIT("knit"),
        LACE("lace"),
        LINEN("linen"),
        LOOPED_PILE("looped pile"),
        MATELASSE("matelasse"),
        METAL("metal"),
        MICROFIBER("microfiber"),
        MOHAIR("mohair"),
        NATURAL_FIBER("natural fiber"),
        NYLON("nylon"),
        PLAIN_WEAVE("plain weave"),
        PLASTIC("plastic"),
        POLYESTER("polyester"),
        RAMIE("ramie"),
        RAYON("rayon"),
        RIB_KNIT("rib knit"),
        RIB_WEAVE("rib weave"),
        SATIN_WEAVE("satin weave"),
        SHEARED_PILE("sheared pile"),
        SHELL("shell"),
        SILK("silk"),
        SPANDEX("spandex"),
        SYNTHETIC_FIBER("synthetic fiber"),
        TAFFETA("taffeta"),
        TWILL_WEAVE("twill weave"),
        VELVET("velvet"),
        WOOD("wood"),
        WOOL("wool");

        public final String getDisplayName() {
            return displayName;
        }

        private Material(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum OverallSilhouette implements Feature {
        A_LINE("A-line"),
        POLONAISE("Polonaise"),
        S_CURVE("S-curve"),
        BIAS_CUT("bias-cut"),
        BUSTLE("bustle"),
        CHEMISE("chemise"),
        COAT("coat"),
        CRINOLINE("crinoline"),
        DROP_WAIST("drop-waist"),
        EMPIRE("empire"),
        FIT_AND_FLARE("fit and flare"),
        HOURGLASS("hourglass"),
        JUMPER("jumper"),
        MANTUA("mantua"),
        PINAFORE("pinafore"),
        PRINCESS("princess"),
        ROBE_A_L_ANGLAISE("robe a l'Anglaise"),
        ROBE_A_LA_FRANCAISE_WATTEAU_BACK("robe a la Francaise / Watteau back"),
        ROUND_GOWN("round gown"),
        SHEATH("sheath"),
        SHIRTWAIST("shirtwaist"),
        SLIP("slip"),
        TENT_TRAPEZE("tent / trapeze"),
        TOGA("toga"),
        TUNIC("tunic"),
        WRAP("wrap");

        public final String getDisplayName() {
            return displayName;
        }

        private OverallSilhouette(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum ShawlBorderType implements Feature {
        COMPLEX("complex"),
        CONTAINED("contained"),
        LONG_FRINGE("long fringe"),
        NARROW("narrow"),
        SHORT_FRINGE("short fringe"),
        WIDE("wide");

        public final String getDisplayName() {
            return displayName;
        }

        private ShawlBorderType(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum ShawlDesignFeatures implements Feature {
        ABAB_REPEAT("ABAB repeat"),
        ASSYMETRICAL_MOTIFS("assymetrical motifs"),
        BI_LATERAL_SYMMETRY("bi-lateral symmetry"),
        CENTRAL_CIRCLE("central circle"),
        MOON("moon"),
        SPRIGS("sprigs"),
        STRAIGHT_BOTEHS("straight botehs"),
        SYMMETRICAL_MOTIFS("symmetrical motifs"),
        TILTING_BOTEHS("tilting botehs");

        public final String getDisplayName() {
            return displayName;
        }

        private ShawlDesignFeatures(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum ShawlShape implements Feature {
        LONG("long"),
        SEMI_CIRCLE("semi-circle"),
        SQUARE("square"),
        TRIANGULAR("triangular");

        public final String getDisplayName() {
            return displayName;
        }

        private ShawlShape(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureCut implements Feature {
        BIAS("bias"),
        STRAIGHT("straight"),
        STRAIGHT_CROSSWISE_GRAIN("straight (crosswise grain)"),
        STRAIGHT_LENGTHWISE_GRAIN("straight (lengthwise grain)");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureCut(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureHem implements Feature {
        ABOVE_KNEE("above knee"),
        ANKLE("ankle"),
        ASYMMETRICAL("asymmetrical"),
        FLOOR("floor"),
        FLOUNCED("flounced"),
        HIP("hip"),
        KNEE("knee"),
        MAXI("maxi"),
        MID_CALF("mid calf"),
        MID_THIGH("mid-thigh"),
        MIDI("midi"),
        RUFFLED("ruffled"),
        TRAIN("train"),
        VARIED("varied");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureHem(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureLining implements Feature {
        ATTACHED_CRINOLINES("attached crinolines"),
        ATTACHED_RUFFLES("attached ruffles"),
        BODICE_FULLY_LINED("bodice fully lined"),
        BODICE_PARTIALLY_LINED("bodice partially lined"),
        BONING("boning"),
        PADS("pads"),
        PANTS_FULLY_LINED("pants fully lined"),
        PANTS_PARTIALLY_LINED("pants partially lined"),
        SKIRT_FULLY_LINED("skirt fully lined"),
        SKIRT_PARTIALLY_LINED("skirt partially lined"),
        WAIST_TAPE("waist tape");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureLining(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureNeckline implements Feature {
        CHELSEA_COLLAR("Chelsea collar"),
        MANDARIN_CHINESE_CADET_COLLAR("Mandarin / Chinese / cadet collar"),
        NAPOLEON("Napoleon"),
        PETER_PAN_COLLAR("Peter Pan collar"),
        PURITAN_COLLAR("Puritan collar"),
        QUEEN_ANNE_HIGH_COLLAR("Queen Anne / high collar"),
        ASCOT_COLLAR("ascot collar"),
        BAND_COLLAR("band collar"),
        BATEAU_BOAT("bateau / boat"),
        BERTHA_COLLAR("bertha collar"),
        BOW_COLLAR("bow collar"),
        CONVERTIBLE_COLLAR("convertible collar"),
        COWL("cowl"),
        CREW("crew"),
        FUNNEL_COLLAR("funnel collar"),
        GATHERED_COLLAR("gathered collar"),
        HALTER("halter"),
        HENLEY("henley"),
        HOOD("hood"),
        INSET("inset"),
        JABOT_COLLAR("jabot collar"),
        JEWEL("jewel"),
        KEYHOLE("keyhole"),
        LAYERED("layered"),
        OFF_THE_SHOULDER("off the shoulder"),
        PEAKED_LAPEL_COLLAR("peaked lapel collar"),
        POLO_COLLAR("polo collar"),
        PORTRAIT_COLLAR("portrait collar"),
        ROUND("round"),
        RUFFLED_COLLAR("ruffled collar"),
        SAILOR_MIDDY_COLLAR("sailor / middy collar"),
        SCOOP("scoop"),
        SHAWL_COLLAR("shawl collar"),
        SQUARE("square"),
        STRAPLESS("strapless"),
        SWEETHEART("sweetheart"),
        TURTLENECK_COLLAR("turtleneck collar"),
        V_NECK("v-neck"),
        WINGTIP_COLLAR("wingtip collar");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureNeckline(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructurePants implements Feature {
        BERMUDA("Bermuda"),
        JAMAICA("Jamaica"),
        ANKLE("ankle"),
        BRIEFS("briefs"),
        CAPRI("capri"),
        FLARED("flared"),
        HAREM("harem"),
        KNICKERS("knickers"),
        PALAZZO("palazzo"),
        PEDAL_PUSHER("pedal-pusher"),
        SHORT_SHORTS_HOT_PANTS("short-shorts / hot pants"),
        SHORTS("shorts"),
        TOREADOR("toreador");

        public final String getDisplayName() {
            return displayName;
        }

        private StructurePants(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureSkirt implements Feature {
        A_LINE("a-line"),
        ACCORDION_PLEATED("accordion pleated"),
        BALLOON("balloon"),
        BOX_PLEATED("box-pleated"),
        BUSTLE("bustle"),
        CIRCULAR("circular"),
        CRINOLINE("crinoline"),
        DIRNDL("dirndl"),
        FLARED("flared"),
        FLOUNCED("flounced"),
        GATHERED("gathered"),
        HANDKERCHIEF("handkerchief"),
        LAYERED("layered"),
        NO_SEAM_AT_CENTER_BACK("no seam at center back"),
        PEG_TOP("peg-top"),
        PEGGED_TAPERED("pegged/tapered"),
        PEPLUM("peplum"),
        PRAIRIE("prairie"),
        SARONG("sarong"),
        SEAM_AT_CENTER_BACK("seam at center back"),
        STRAIGHT("straight"),
        SWAGGED("swagged"),
        TIERED("tiered"),
        TRUMPET("trumpet"),
        YOKED("yoked");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureSkirt(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureSleeveLength implements Feature {
        CAMISOLE_STRAPS("camisole straps"),
        CAP("cap"),
        ELBOW("elbow"),
        EXTRA_LONG("extra long"),
        HANGING("hanging"),
        LONG("long"),
        SHORT("short"),
        STRAPLESS("strapless"),
        TANK("tank"),
        THREE_QUARTER("three-quarter");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureSleeveLength(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureSleeves implements Feature {
        TWO_PIECE_TAILORED("2-piece tailored"),
        JULIET("Juliet"),
        BATWING("batwing"),
        BELL("bell"),
        BISHOP("bishop"),
        BLOCK_STRAIGHT("block/straight"),
        CAMISOLE_STRAPS("camisole straps"),
        CAP("cap"),
        COWL("cowl"),
        CRISS_CROSS_STRAPS("criss-cross straps"),
        DOLMAN("dolman"),
        ELBOW_DART("elbow dart"),
        ELBOW_GATHERS("elbow gathers"),
        ELBOW_LENGTH("elbow length"),
        EXTRA_LONG("extra long"),
        FITTED("fitted"),
        HANGING("hanging"),
        KIMONO("kimono"),
        LANTERN("lantern"),
        LAYERED("layered"),
        LEG_O_MUTTON("leg-o-mutton"),
        LONG("long"),
        PETAL("petal"),
        PUFF("puff"),
        RACERBACK_STRAPS("racerback straps"),
        RAGLAN("raglan"),
        ROLL_UP("roll-up"),
        SECTIONS_PANES("sections/panes"),
        SHIRT("shirt"),
        SHORT("short"),
        SPAGHETTI_CAMISOLE_STRAPS("spaghetti/camisole straps"),
        STRAPLESS("strapless"),
        TANK("tank"),
        THREE_QUARTER_LENGTH("three-quarter length"),
        WIDE_STRAPS("wide straps");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureSleeves(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureTorso implements Feature {
        ONE_DART("1 dart"),
        TWO_DARTS("2 darts"),
        THREE_DARTS("3 darts"),
        FOUR_DARTS("4 darts"),
        FIVE_DARTS("5 darts"),
        SIX_DARTS("6 darts"),
        SEVEN_OR_MORE_DARTS("7 or more darts"),
        BACK_YOKE("back yoke"),
        BACK_YOKE_WITH_GATHERS("back yoke with gathers"),
        BLOUSED_FRONT_PIGEON_BREAST("bloused front (pigeon breast)"),
        BUST_DARTS("bust darts"),
        FRONT_YOKE("front yoke"),
        FRONT_YOKE_WITH_GATHERS("front yoke with gathers"),
        GATHERED("gathered"),
        NO_DARTS_SEAMS("no darts/seams"),
        OTHER_DARTS("other darts"),
        OTHER_PLEATS("other pleats"),
        OTHER_SEAMS("other seams"),
        PRINCESS_SEAMS("princess seams"),
        SHOULDER_DARTS("shoulder darts"),
        SHOULDER_PLEATS("shoulder pleats"),
        SIDE_SEAMS_ONLY("side seams only"),
        TOPLESS("topless"),
        TRAPEZE("trapeze"),
        WAIST_DARTS_FRONT("waist darts-front"),
        WAIST_PLEATS("waist pleats"),
        WAIST_DARTS_BACK("waist-darts-back"),
        WRAP("wrap"),
        YOKE("yoke"),
        YOKE_WITH_GATHERS("yoke with gathers");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureTorso(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureWaist implements Feature {
        EMPIRE_UNDER_BUST("Empire / under bust"),
        ANGLED_TO_SIDE("angled to side"),
        ASYMMETRICAL("asymmetrical"),
        BARE_MIDRIFF("bare midriff"),
        BASQUE("basque"),
        BOLERO("bolero"),
        CURVED("curved"),
        DROPPED("dropped"),
        HIGH("high"),
        HIP_LEVEL("hip-level"),
        NATURAL("natural"),
        NO_WAISTLINE("no waistline"),
        POINTED("pointed"),
        STRAIGHT("straight"),
        WRAP("wrap");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureWaist(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum StructureWaistShape implements Feature {
        ANGLED_TO_SIDE("angled to side"),
        BASQUE("basque"),
        BOLERO("bolero"),
        CURVED("curved"),
        NO_WAISTLINE("no waistline"),
        POINTED("pointed"),
        STRAIGHT("straight"),
        WRAP("wrap");

        public final String getDisplayName() {
            return displayName;
        }

        private StructureWaistShape(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public enum Technique implements Feature {
        APPLIQUE("applique"),
        BEADING("beading"),
        BRAIDING("braiding"),
        BURN_OUT("burn-out"),
        CROCHETING("crocheting"),
        DRAWLOOM("drawloom"),
        EMBOSSING("embossing"),
        EMBROIDERY("embroidery"),
        FLOCKING("flocking"),
        GLAZING("glazing"),
        HAND_SEWING("hand sewing"),
        HAND_WEAVING("hand weaving"),
        KNITTING("knitting"),
        LACE_MAKING("lace making"),
        MACHINE_SEWING("machine sewing"),
        MERCERIZING("mercerizing"),
        NEEDLEPOINT("needlepoint"),
        PAINTING("painting"),
        PIECING("piecing"),
        PIPING("piping"),
        PLEATING("pleating"),
        POLISHING("polishing"),
        PRINTING("printing"),
        QUILTING("quilting"),
        RUFFLING("ruffling"),
        SMOCKING("smocking"),
        WEAVING("weaving");

        public final String getDisplayName() {
            return displayName;
        }

        private Technique(final String displayName) {
            this.displayName = displayName;
        }

        private final String displayName;
    }

    public final static ImmutableMap<String, Feature[]> FEATURES = ImmutableMap.<String, Feature[]> builder().put("Closure Placement", ClosurePlacement.values()).put("Closure Type", ClosureType.values()).put("Material", Material.values()).put("Overall Silhouette", OverallSilhouette.values()).put("Shawl Border Type", ShawlBorderType.values()).put("Shawl Design Features", ShawlDesignFeatures.values()).put("Shawl Shape", ShawlShape.values()).put("Structure Cut", StructureCut.values()).put("Structure Hem", StructureHem.values()).put("Structure Lining", StructureLining.values()).put("Structure Neckline", StructureNeckline.values()).put("Structure Pants", StructurePants.values()).put("Structure Skirt", StructureSkirt.values()).put("Structure Sleeve Length", StructureSleeveLength.values()).put("Structure Sleeves", StructureSleeves.values()).put("Structure Torso", StructureTorso.values()).put("Structure Waist", StructureWaist.values()).put("Structure Waist Shape", StructureWaistShape.values()).put("Technique", Technique.values()).build();
}