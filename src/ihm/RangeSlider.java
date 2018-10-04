package ihm;

import javax.swing.JSlider;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RangeSlider extends JSlider {

    public static String ACCESSIBLE_UPPER_VALUE_PROPERTY = "upper_value_property";

    public RangeSlider(int orientation, int min, int max, int value, int upperValue) {
        this.orientation = SwingConstants.HORIZONTAL;
        setModel(new DefaultBoundedRangeSliderModel(value, 0, upperValue, 0, min, max));
        updateUI();
    }

    @Override
    public void updateUI() {
        setUI(new RangeSliderUI(this));
        updateLabelUIs();
    }

    public int getUpperValue() {
        if (getModel().getClass() != DefaultBoundedRangeSliderModel.class)
            return 0;

        return ((BoundedRangeSliderModel) getModel()).getUpperValue();
    };

    public void setUpperValue(int n) {
        BoundedRangeSliderModel m = (BoundedRangeSliderModel) getModel();
        int oldValue = m.getUpperValue();
        if (oldValue == n)
            return;
        m.setUpperValue(n);

        if (accessibleContext != null)
            accessibleContext.firePropertyChange(RangeSlider.ACCESSIBLE_UPPER_VALUE_PROPERTY, Integer.valueOf(oldValue),
                    Integer.valueOf(m.getUpperValue()));
    };

    public int getUpperExtent() {
        return ((BoundedRangeSliderModel) getModel()).getUpperExtent();
    }

}
