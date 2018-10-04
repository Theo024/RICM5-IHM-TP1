package ihm;

import java.util.EventListener;

import javax.swing.BoundedRangeModel;
import javax.swing.event.ChangeListener;

public interface BoundedRangeSliderModel extends BoundedRangeModel {

    @Override
    int getValue();

    int getUpperValue();

    @Override
    int getExtent();

    int getUpperExtent();

    @Override
    int getMinimum();

    @Override
    int getMaximum();

    @Override
    void setValue(int n);

    void setUpperValue(int n);

    @Override
    void setExtent(int n);

    void setUpperExtent(int n);

    @Override
    void setMinimum(int n);

    @Override
    void setMaximum(int n);

    @Override
    void setValueIsAdjusting(boolean b);

    @Override
    boolean getValueIsAdjusting();

    void setRangeProperties(int newValue, int newExtent, int newUpperValue, int newUpperExtent, int newMin, int newMax,
            boolean adjusting);

    @Override
    void addChangeListener(ChangeListener l);

    @Override
    void removeChangeListener(ChangeListener l);

    ChangeListener[] getChangeListeners();

    <T extends EventListener> T[] getListeners(Class<T> listenerType);

}
