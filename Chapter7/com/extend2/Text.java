package Chapter7.com.extend2;

public class Text {
    public static void main(String[] args) {
        PC pc = new PC("i8","华为","三星","小米");
        System.out.println("PC的品牌为:"+ pc.brand+"\t"+pc.getDetail());

        NotePad notePad = new NotePad("i8","金士顿","七彩虹","灰色");
        System.out.println("NotePad的颜色为:"+ notePad.color+"\t"+notePad.getDetail());

    }
}
