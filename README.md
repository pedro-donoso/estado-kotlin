![libros](https://github.com/user-attachments/assets/a414f5b2-8c08-4d21-8000-9b5f5f9145d1)

### 1. Habilito viewbinding y databinding:

 ```
 buildFeatures {
        compose = true
        viewBinding = true
    }
    
    dataBinding {
        enable = true
    }
```

### 2. Agrego dependencias (Reemplazar por versión actual y Sincronizar):
```
val nav_version = "2.7.7"
    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
```

### 3. Configuro activity_main:

en res 
creo directory -> layout -> layout resource file -> activity_main

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    >

</androidx.constraintlayout.widget.ConstraintLayout>
```

### 4. Configuro themes (res -> values -> themes.xml):

```
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="Theme.Estado" parent="Theme.AppCompat.DayNight.DarkActionBar" />
</resources>
```

### 5. Configuro Manifest:

```
<activity
    android:name=".MainActivity"
    android:exported="true"
    android:label="@string/app_name"
    android:theme="@style/Theme.AppCompat.DayNight.NoActionBar">
       <intent-filter>
          <action android:name="android.intent.action.MAIN" />
             <category android:name="android.intent.category.LAUNCHER" />
       </intent-filter>
</activity>
```

### 6. Agrego Permiso Internet en Manifest:

```
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
```

### 7. Cambio AppCompatActivity() en MainActivity:

```
class MainActivity : ComponentActivity() {...
```

### 8. Cambio título App en MainActivity:
```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        supportActionBar?.title = "Mi Colección de Libros"
```
