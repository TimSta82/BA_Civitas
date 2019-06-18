<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.tim.romaniitedomum">

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>

    <application
        android:name=".ApplicationClass"
        android:allowBackup="true"
        android:icon="@mipmap/ic_logo"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_logo_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">

        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="@string/google_maps_API_key" />

        <meta-data
            android:name="com.google.android.gms.version"
            android:value="@integer/google_play_services_version" />

        <activity
            android:name=".MainActivity"
            android:theme="@style/AppTheme.NoActionBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

        <activity
            android:name=".map.MapActivity"
            android:parentActivityName=".MainActivity"
            android:screenOrientation="portrait"
            android:theme="@style/AppTheme.NoActionBar">

        </activity>

        <activity
            android:name=".artefact.ArtefactActivity"
            android:parentActivityName=".MainActivity"
            android:screenOrientation="portrait"
            android:theme="@style/AppTheme.NoActionBar">

        </activity>

        <activity android:name=".impressum.ImpressumActivity"
            android:parentActivityName=".MainActivity"
            android:screenOrientation="portrait"
            android:theme="@style/AppTheme.NoActionBar">
        </activity>
    </application>

</manifest>