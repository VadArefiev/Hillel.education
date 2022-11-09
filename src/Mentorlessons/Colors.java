package Mentorlessons;

public enum Colors {

    BROWN("#964B00", Association.CHOCOLATE),
    BLUE("#0000FF", Association.SKY),
    YELLOW("#FFFF00", Association.LOVE),
    CHERRY_RED("#D2042D", Association.BLOOD),
    RED("##FF0000", Association.EVIL);

    private final String hex;
    private final Association association;


    Colors(String hex, Association association) {
        this.hex = hex;
        this.association = association;
    }

    public String getHex() {
        return hex;
    }

    public static Colors[] getColorsWithBadAssociation() {
        Colors[] values = Colors.values();
        Colors[] result = new Colors[Colors.values().length];
        int i = 0;
        for (Colors value : values) {
            if (value.getAssociation().isEvil) {
                result[i] = value;
                i++;
            }
        }
        return result;
    }

    public Association getAssociation() {
        return association;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "hex='" + hex + '\'' +
                ", association=" + association +
                '}';
    }

    public enum Association {
        EVIL(true),
        SKY(false),
        LOVE(false),
        PAIN(true),
        GAIN(false),
        GROUND(false),
        GAY(false),
        CHOCOLATE(false),
        BLOOD(true);

        private final boolean isEvil;


        Association(boolean isEvil) {
            this.isEvil = isEvil;
        }

        public boolean isEvil() {
            return isEvil;
        }
    }
}
