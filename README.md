# Material Button and Toast


[![JitPack](https://img.shields.io/badge/JitPack-1.0.0.beta-brightgreen.svg?style=for-the-badge)](https://jitpack.io/#debanikita/android-material)        

[![Blogger](https://img.shields.io/badge/Blogger-FF5722?style=for-the-badge&logo=blogger&logoColor=white)](https://debanikita.blogspot.com)   

[![Facebook](https://img.shields.io/badge/Facebook-1877F2?style=for-the-badge&logo=facebook&logoColor=white)](https://www.facebook.com/mr.deba.000?mibextid=ZbWKwL)


# Coming Soon Gradient Button Source Code And Toast Source Code ❤️

## Screenshot
<img src="https://github.com/debanikita/android-material/blob/d281a1e930d89d5c15a27d8d3f8ce2ee4596c2cf/material-button-style.png"/>

## Getting Started

To start working with material button, you need to add its dependency into your `build.gradle` file:
### Dependency
```groovy
dependencies {
    implementation "com.github.debanikita:android-material:1.0.0.beta" // Androidx...
}
```

Then you need to add jitpack as your maven repository in `build.gradle`  file:

```groovy
repositories {
    google()
    jcenter()
    maven { url 'https://jitpack.io' }
}
```

## Sample
There is a fully functional sample application that demonstrates the usage of material button, all you have to do is cloning the project and running the [sample](https://github.com/farasource/material-button/tree/master/sample) module.
## How to use

Use material button in the layout pragmatically
```JAVA
DnButton materialButton = findViewById(R.id.dnButton);
List<ButtonBackground.DrawableParams> drawableParams = new ArrayList<>();
drawableParams.add(ButtonBackground.DrawableParams.newBuilder()
    .addButtonStateType(-ButtonUtilities.ButtonStateType.ENABLED)
    .setColors(0xffe2e2e2)
    .setRadius(10)
    .setRadius(10, 10, 10, 10)
    .build());
drawableParams.add(ButtonBackground.DrawableParams.newBuilder()
    .addButtonStateType(ButtonUtilities.ButtonStateType.PRESSED)
    .setColors(0xff009688, 0xffE0F2F1, 0xff009688)
    .setRadius(10)
    .setRadius(10, 10, 10, 10)
    .setStrokeWidth(3)
    .setStrokeColor(0xff009688)
    .build());
drawableParams.add(ButtonBackground.DrawableParams.newBuilder()
    .addButtonStateType(ButtonUtilities.ButtonStateType.NONE)
    .setColors(Color.TRANSPARENT)
    .build());
materialButton.setBackgroundParamsList(drawableParams);
// or
materialButton.setBackgroundParamsList(drawableParams, ButtonBackground.RippleParams.newBuilder()
    .addButtonStateType(ButtonUtilities.ButtonStateType.PRESSED)
    .setColor(Color.WHITE)
    .build());
// or
List<ButtonBackground.RippleParams> rippleParams = new ArrayList<>();
rippleParams.add(ButtonBackground.RippleParams.newBuilder()
    .addButtonStateType(-ButtonUtilities.ButtonStateType.ENABLED)
    .setColor(Color.GRAY)
    .build());
rippleParams.add(ButtonBackground.RippleParams.newBuilder()
    .addButtonStateType(ButtonUtilities.ButtonStateType.PRESSED)
    .setColor(Color.WHITE)
    .build());
materialButton.setBackgroundParamsList(drawableParams, rippleParams);
```

Use material button in the layout via xml
```XML
<com.debashis.io.material.DnButton
    android:id="@+id/materialButton"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Button"
    app:cornerRadius="7dp"
    app:backgroundTint="@color/colorPrimary"
    app:cornerTopStartRadius="0dp"
    app:cornerTopEndRadius="0dp"
    app:cornerBottomEndRadius="0dp"
    app:cornerBottomStartRadius="0dp"
    app:elevation="0dp"
    app:rippleColor="?rippleColor"
    app:strokeColor="@color/black"
    app:strokeWidth="0dp"
    app:scale="1.03"
    app:useScale="true" />
```
# Example

### Button 1,2 Design

<img src="https://github.com/debanikita/android-material/blob/1380e800214fa65625a7d40d9798fc5b980578d7/20241004_220057.png"/>

```XML

<com.debashis.io.material.button.DnButton
    android:id="@+id/DnButton1"
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:layout_marginHorizontal="10dp"
    android:text="Love"
    app:cornerRadius="2dp"
    app:rippleColor="@color/white"
    app:strokeColor="@color/white"
    app:strokeWidth="0dp"
    app:elevation="1dp"
    app:useScale="true"
    app:backgroundTint="#651FFF"
    android:layout_marginBottom="10dp"/>
    
<com.debashis.io.material.button.DnButton
    android:id="@+id/DnButton2"
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:layout_marginHorizontal="10dp"
    app:cornerRadius="2dp"
    app:rippleColor="@color/white"
    app:strokeColor="@color/white"
    app:strokeWidth="0dp"
    app:elevation="1dp"
    app:useScale="true"
    android:text="Java"
    android:drawableStart="@drawable/language_java"
    app:backgroundTint="#651FFF"/>
    
```
### Button 3,4 Design

<img src="https://github.com/debanikita/android-material/blob/2ca80fcddd1ba03379d01579882346f18208912c/20241004_220803.png"/>

```XML

<com.debashis.io.material.button.DnButton
    android:id="@+id/DnButton3"
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:layout_marginHorizontal="10dp"
    android:text="Python"
    app:cornerRadius="30dp"
    app:rippleColor="@color/white"
    app:strokeColor="@color/white"
    app:strokeWidth="0dp"
    app:elevation="1dp"
    app:useScale="true"
    android:drawableStart="@drawable/language_python"
    app:backgroundTint="#FF1744"
    android:layout_marginBottom="10dp"/>
    
<com.debashis.io.material.button.DnButton
    android:id="@+id/DnButton4"
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:layout_marginHorizontal="10dp"
    android:text="Xml"
    app:cornerRadius="30dp"
    app:rippleColor="@color/white"
    app:strokeColor="@color/white"
    app:strokeWidth="0dp"
    app:elevation="1dp"
    app:useScale="true"
    android:drawableEnd="@drawable/xml"
    app:backgroundTint="#FF1744"
    android:layout_marginBottom="10dp"/>
    		
```

### Button 5,6 Design

<img src="https://github.com/debanikita/android-material/blob/74b509253c36c8f92da01811c9efb1989ab2e401/20241004_221257.png"/>

```XML

<com.debashis.io.material.button.DnButton
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:text="Github"
    app:elevation="1dp"
    android:layout_marginHorizontal="10dp"
    android:drawableStart="@drawable/github"
    app:backgroundTint="#FF4081"
    app:cornerBottomStartRadius="30dp"
    app:cornerTopStartRadius="30dp"
    app:cornerBottomEndRadius="0dp"
    app:cornerTopEndRadius="0dp"
    app:rippleColor="#ffffff"
    app:useScale="true"
    android:id="@+id/DnButton9"
    android:layout_marginBottom="10dp"/>
    	
<com.debashis.io.material.button.DnButton
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:text="React"
    app:elevation="1dp"
    android:layout_marginHorizontal="10dp"
    android:drawableEnd="@drawable/react"
    app:backgroundTint="#FF4081"
    app:cornerBottomStartRadius="0dp"
    app:cornerTopStartRadius="0dp"
    app:cornerBottomEndRadius="30dp"
    app:cornerTopEndRadius="30dp"
    app:rippleColor="#ffffff"
    app:useScale="true"
    android:id="@+id/DnButton10"/>
   
```

### Button 7,8 Design

<img src="https://github.com/debanikita/android-material/blob/74b509253c36c8f92da01811c9efb1989ab2e401/20241004_221257.png"/>

```XML

<com.debashis.io.material.button.DnButton
    android:layout_width="150dp"
   	android:layout_height="40dp"
    android:text="Debashis"
   	android:layout_marginHorizontal="10dp"
   	android:textColor="#ffffff"
   	app:backgroundTint="#00C853"
   	app:cornerBottomEndRadius="0dp"
   	app:cornerTopStartRadius="0dp"
   	app:elevation="1dp"
   	app:rippleColor="#ffffff"
   	app:scale="1.03"
   	app:useScale="true"
   	android:id="@+id/DnButton7"
   	android:layout_marginBottom="10dp"/>
   
<com.debashis.io.material.button.DnButton
   	android:layout_width="150dp"
   	android:layout_height="40dp"
   	android:text="Html5"
   	android:layout_marginHorizontal="10dp"
   	android:textColor="#ffffff"
   	app:backgroundTint="#00C853"
   	app:cornerBottomEndRadius="0dp"
   	app:cornerTopStartRadius="0dp"
   	app:elevation="1dp"
   	app:rippleColor="#ffffff"
   	app:scale="1.03"
   	app:useScale="true"
   	android:drawableStart="@drawable/language_html5"
   	android:id="@+id/DnButton8"
    android:layout_marginBottom="10dp"/>
    
```

### Button 9,10 Design

```XML

<com.debashis.io.material.button.DnButton
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:text="Github"
    app:elevation="1dp"
    android:layout_marginHorizontal="10dp"
    android:drawableStart="@drawable/github"
    app:backgroundTint="#FF4081"
    app:cornerBottomStartRadius="30dp"
    app:cornerTopStartRadius="30dp"
    app:cornerBottomEndRadius="0dp"
    app:cornerTopEndRadius="0dp"
    app:rippleColor="#ffffff"
    app:useScale="true"
    android:id="@+id/DnButton9"
    android:layout_marginBottom="10dp"/>
    	
<com.debashis.io.material.button.DnButton
    android:layout_width="150dp"
    android:layout_height="40dp"
    android:text="React"
    app:elevation="1dp"
    android:layout_marginHorizontal="10dp"
    android:drawableEnd="@drawable/react"
    app:backgroundTint="#FF4081"
    app:cornerBottomStartRadius="0dp"
    app:cornerTopStartRadius="0dp"
    app:cornerBottomEndRadius="30dp"
    app:cornerTopEndRadius="30dp"
    app:rippleColor="#ffffff"
    app:useScale="true"
    android:id="@+id/DnButton10"/>
   
```

## Author & support
This project was created by [Debashis Sabar](https://www.instagram.com/mr_deba_000) .
> You can help us to keep my open source projects up to date!
