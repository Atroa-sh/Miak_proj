public class Box extends Shape{
    protected final int size_x;
    protected final int size_y;
    protected final int size_z;

    public Box(int pos_x, int pos_y, int pos_z, int size_x, int size_y, int size_z, int r, int g, int b) {
        super(pos_x, pos_y, pos_z, r, g, b);

        this.size_x = size_x;
        this.size_y = size_y;
        this.size_z = size_z;
    }

    @Override
    protected String start() {
        return super.start() + String.format(
                "<box size='%d %d %d'>\n",
                this.size_x, this.size_y, this.size_z
        );
    }

    @Override
    protected String finish() {
        return "</box>\n" + super.finish();
    }

    @Override
    public String build() {
        return this.start() + this.finish();
    }
}
