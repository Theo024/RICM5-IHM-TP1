# RICM5 - IHM - TP1

> Théo Lévesque - Timothée Depriester
> Polytech Grenoble - 2018

## Question 2.1

``` java
int getValue()
int getUpperValue()
int getExtent()
int getUpperExtent()
int getMinimum()
int getMaximum()
void setValue(int n)
void setUpperValue(int n)
void setExtent(int n)
void setUpperExtent(int n)
void setMinimum(int n)
void setMaximum(int n)
void setValueIsAdjusting(boolean b)
boolean getValueIsAdjusting()
void setRangeProperties(int newValue, int newExtent, int newUpperValue, int newUpperExtent, int newMin, int newMax, boolean adjusting)
void addChangeListener(ChangeListener l)
void removeChangeListener(ChangeListener l)
ChangeListener[] getChangeListeners()
<T extends EventListener> T[] getListeners(Class<T> listenerType)
```

## Question 2.2

- Lorsque l'on déplace le curseur minimum, respectivement maximum, la valeur associée s'ajuste. Le curseur maximum doit toujours être à droite du curseur minimum. Les deux curseurs peuvent prendre la même valeur.
- Lorsque l'on clique sur la partie extérieure du slider, la valeur de la borne la plus proche est modifiée.

## Question 2.3

Voir code.
