# Firebase Android Chat

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-FirebaseAndroidChat-green.svg?style=true)](https://android-arsenal.com/details/3/3812)

> Preview

![alt tag](https://github.com/AleBarreto/FirebaseAndroidChat/blob/master/prints/1.png?raw=true)
![alt tag](https://github.com/AleBarreto/FirebaseAndroidChat/blob/master/prints/2.png?raw=true)
![alt tag](https://github.com/AleBarreto/FirebaseAndroidChat/blob/master/prints/3.png?raw=true)

> Features Chat

* Login with Google
* Send Photo Camera
* Send Photo Gallery
* Send Location

> Libraries

```gradle

    //SUPPORT ANDROID
    compile 'com.android.support:appcompat-v7:24.0.0'
    compile 'com.android.support:recyclerview-v7:24.0.0'
    compile 'com.android.support:design:24.0.0'

    //IMAGE LOAD
    compile 'com.github.bumptech.glide:glide:3.7.0'

    //CHAT UI
    compile 'hani.momanii.supernova_emoji_library:supernova-emoji-library:0.0.2'
    compile 'me.himanshusoni.chatmessageview:chat-message-view:1.0.3'

    // AUTH
    compile 'com.google.android.gms:play-services-auth:9.2.0'
    compile 'com.google.firebase:firebase-auth:9.0.2'

    //DATABASE FIREBASE,UI
    compile 'com.google.firebase:firebase-database:9.0.2'
    compile 'com.firebaseui:firebase-ui-database:0.4.1'

    //STORAGE FIREBASE
    compile 'com.google.firebase:firebase-storage:9.0.2'

    //Places SERVICES
    compile 'com.google.android.gms:play-services-places:9.2.0'

```

#### JSON Format

> Message Simple

```JSON

{
  "chatmodel":{
    "-KLIcSzPmPrp0RG2YW0_" : {
      "message" : "Hi",
      "timeStamp" : "1467060707716",
      "userModel" : {
        "name" : "Alessandro Barreto",
        "photo_profile" : "xxxxxx"
      }
  },
  ...
}


```

> Send Location Message

```JSON

{
  "chatmodel":{
    "-KLId9H8NBsmrwO6SKEo" : {
      "mapModel" : {
        "latitude" : "-3.084669",
        "longitude" : "-60.010532"
      },
      "timeStamp" : "1467060908238",
      "userModel" : {
        "name" : "Alessandro Barreto",
        "photo_profile" : "xxxxxxxxxxxxxxxxxxx"
      }
    },
  ...
}


```

> File Message

```JSON

{
  "chatmodel":{
    "-KLIdX28VWjlqtZZr2Vn" : {
      "file" : {
        "name_file" : "2016-06-27_045641",
        "size_file" : "",
        "type" : "img",
        "url_file" : "xxxxxxxxxxxxxxxxxxxxxxx"
      },
      "message" : "",
      "timeStamp" : "1467061005589",
      "userModel" : {
        "name" : "Alessandro Barreto",
        "photo_profile" : "xxxxxxxxxxxxxxxxxx"
      }
    },
  ...
}


```

#### Getting Started

1. [Add Firebase to your Android Project.] (https://firebase.google.com/docs/android/setup)
2. Copy the google-services.json file you just downloaded into the app/ or mobile/ directory of your Android Studio project.
3. Select the Auth panel and then click the Sign In Method tab.
4. Click Google and turn on the Enable switch, then click Save

##### Change

```java

public class Util {

    public static final String URL_STORAGE_REFERENCE = "XXXXXXXXXXX";
    
    ...    
}

```

##### Places Api

```xml

<string name="api_key_google_places">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</string>

```









#The MIT License (MIT)
Copyright (c) 2016

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
