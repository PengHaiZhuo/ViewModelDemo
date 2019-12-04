#### 在module的build.gradle的android标签下添加 

```java
    dataBinding{
        enabled=true
    }
```

#### 在module的build.gradle的dependencies标签添加依赖

```java
implementation 'com.google.android.material:material:1.2.0-alpha02'
implementation 'androidx.lifecycle:lifecycle-extensions:2.1.0'
```

<p align="center">
	<img src="https://github.com/PengHaiZhuo/hello-world/blob/master/picture/ViewModelDemo.gif" alt="Sample"  width="360" height="640">
	<p align="center">
		<em>demo截图</em>
	</p>
</p>
