[ ![Download](https://api.bintray.com/packages/kucingapes/utsman/com.utsman.recyclerview/images/download.svg) ](https://bintray.com/kucingapes/utsman/com.utsman.recyclerview/_latestVersion)

# RecyclerView Bottom Hider
A library for easy make hide/show bottom view on recycler scrolled

|FAB hide/show|Custom view hide/show|
|--|--|
|![](https://i.ibb.co/6bjXtgJ/20190113-014944.gif)|![](https://i.ibb.co/2c3vVb4/20190113-014913.gif)|

### Installation (not yet on jcenter)
Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
  repositories {
    ....
    maven { url 'https://jitpack.io' }
  }
}
```

Add the dependency
```gradle
dependencies {
    ....
    implementation 'com.github.utsmannn:RecyclerBottomHider:1.0.1'
}
```


### Simple usage
```java
RecyclerViewBottomHider bottomHider = new RecyclerViewBottomHider(bottomView)
recyclerView.addOnScrollListener(bottomHider);
```
#### Using margin view suitable floating action button (margin as DP)
```java
RecyclerViewBottomHider bottomHider = new RecyclerViewBottomHider(bottomView, 12)   // margin=12dp in bottom view
recyclerView.addOnScrollListener(bottomHider);
```

---

### LICENSE
[Apache License v2](https://github.com/utsmannn/RecyclerBottomHider/blob/master/LICENSE)
