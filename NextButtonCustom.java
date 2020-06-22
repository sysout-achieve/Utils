
public class NextButtonCustom extends AppCompatButton{

    enum Enabled{
        ACTIVATE(Color.parseColor("#ffffff"), Color.parseColor("#067a77"), true),
        DEACTIVATE(Color.parseColor("#c8c8cc"), Color.parseColor("#e9e9e9"), false);

        int txtColorRes;
        int bgColorRes;
        boolean enabled;

        Enabled(int txtColorRes, int bgColorRes, boolean enabled) {
            this.txtColorRes = txtColorRes;
            this.bgColorRes = bgColorRes;
            this.enabled = enabled;
        }

        public int getTxtColorRes() {
            return txtColorRes;
        }

        public int getBgColorRes() {
            return bgColorRes;
        }

        public boolean isEnabled() {
            return enabled;
        }
    }

    public NextButtonCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NextButtonCustom(Context context) {
        super(context);
    }

    public void setActivate(Enabled enabled){
        setTextColor(enabled.getTxtColorRes());
        setBackgroundColor(enabled.getBgColorRes());
        setEnabled(enabled.isEnabled());
    }
}
