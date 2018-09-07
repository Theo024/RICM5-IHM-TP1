# RICM5 - IHM - TP1

> Théo Lévesque - Timothée Depriester
> Polytech Grenoble - 2018

## Question 2.1

``` java
void addChangeListener(ChangeListener x)
int getExtent()
int getMaximum()
int getMinimum()
int getMaximumValue()
int getMinimumValue()
boolean getValueIsAdjusting()
void removeChangeListener(ChangeListener x)
void setExtent(int newExtent)
void setMaximum(int newMaximum)
void setMinimum(int newMinimum)
void setRangeProperties(int maxValue, int minValue, int extent, int min, int max, boolean adjusting)
void setMaximumValue(int newValue)
void setMinimumValue(int newValue)
void setValueIsAdjusting(boolean b)
```

## Question 2.2

- Lorsque l'on déplace le curseur minimum, respectivement maximum, la valeur associée s'ajuste. Le curseur maximum doit toujours être à droite du curseur minimum. Les deux curseurs peuvent prendre la même valeur.
- Lorsque l'on clique sur la partie extérieure du slider, la valeur de la borne la plus proche est modifiée.

## Question 2.3

Voir code.
