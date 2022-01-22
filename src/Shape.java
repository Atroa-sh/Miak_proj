public class Shape {
    protected final int pos_x;
    protected final int pos_y;
    protected final int pos_z;

    protected final int r;
    protected final int g;
    protected final int b;

    public Shape(int pos_x, int pos_y, int pos_z, int r, int g, int b) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.pos_z = pos_z;

        this.r = r;
        this.g = g;
        this.b = b;
    }

    protected String start() {
        return String.format(
                "<transform translation='%d %d %d'>\n" +
                "   <shape>\n" +
                "       <appearance>\n" +
                "           <material diffuseColor='%d %d %d'></material>\n" +
                "       </appearance>\n",
            this.pos_x, this.pos_y, this.pos_z,
            this.r, this.g, this.b
        );
    }

    protected String finish() {
        return "    </shape>" +
                "</transform>";
    }

    public String build() {
        return this.start() + this.finish();
    }
}
