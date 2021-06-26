package factory.toolsfactory.tools;

public enum KEY_SIZE {
    KEY_SIZE1(1),
    KEY_SIZE1_5(1.5),
    KEY_SIZE2(2),
    KEY_SIZE2_5(2.5),
    KEY_SIZE3(3),
    KEY_SIZE3_5(3.5),
    KEY_SIZE4(4),
    KEY_SIZE4_5(4.5),
    KEY_SIZE5(5),
    KEY_SIZE5_5(5.5),
    KEY_SIZE6(6),
    KEY_SIZE6_5(6.5),
    KEY_SIZE7(7),
    KEY_SIZE8(8),
    KEY_SIZE9(9),
    KEY_SIZE10(10),
    KEY_SIZE11(11),
    KEY_SIZE12(12),
    KEY_SIZE13(13),
    KEY_SIZE14(14),
    KEY_SIZE15(15),
    KEY_SIZE16(16),
    KEY_SIZE17(17),
    KEY_SIZE18(18),
    KEY_SIZE19(19),
    KEY_SIZE20(20),
    KEY_SIZE21(21),
    KEY_SIZE22(22),
    KEY_SIZE23(23),
    KEY_SIZE24(24),
    KEY_SIZE25(25),
    KEY_SIZE26(26),
    KEY_SIZE27(27),
    KEY_SIZE28(28),
    KEY_SIZE29(29),
    KEY_SIZE30(30),
    KEY_SIZE31(31),
    KEY_SIZE32(32);

    private double numVal;

    KEY_SIZE(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }
}
