# Hello Barcode Xpress for Java

A minimal [Barcode Xpress for Java](https://help.accusoft.com/BarcodeXpress/latest/BxJava/webframe.html#barcode-xpress-overview.html)
application which detects barcodes on a given bitmap image.

## Requirements

You need to have maven to build and run the sample.
For the full list of requirements please refer to the [Barcode Xpress for Java help](https://help.accusoft.com/BarcodeXpress/latest/BxJava/webframe.html#system-requirements.html).

## Repository

Barcode Xpress jar library is hosted on Accusoft's public [maven repository](https://mvn.accusoft.com/)
which is listed as a repository in the pom.xml file.

## Running the Sample

Start the app using maven:

    mvn clean package exec:java

This will build and run the sample and you should see output like this:

    Results:
    [
      {
        "area": {
          "x": 496,
          "y": 81,
          "width": 646,
          "height": 99
        },
        "confidence": 100,
        "point1": {
          "x": 496,
          "y": 81
        },
        "point2": {
          "x": 1142,
          "y": 82
        },
        "point3": {
          "x": 1142,
          "y": 180
        },
        "point4": {
          "x": 496,
          "y": 180
        },
        "skew": 0,
        "value": "441231234561234567** UNLICENSED accusoft.com",
        "valueAsByte": [
          52,
          52,
          49,
          50,
          51,
          49,
          50,
          51,
          52,
          53,
          54,
          49,
          50,
          51,
          52,
          53,
          54,
          55,
          42,
          42,
          32,
          85,
          78,
          76,
          73,
          67,
          69,
          78,
          83,
          69,
          68,
          32,
          97,
          99,
          99,
          117,
          115,
          111,
          102,
          116,
          46,
          99,
          111,
          109,
          0
        ],
        "type": "INTELLIGENTMAIL"
      },
      {
        "area": {
          "x": 60,
          "y": 89,
          "width": 349,
          "height": 84
        },
        "confidence": 100,
        "point1": {
          "x": 60,
          "y": 89
        },
        "point2": {
          "x": 409,
          "y": 89
        },
        "point3": {
          "x": 409,
          "y": 173
        },
        "point4": {
          "x": 60,
          "y": 173
        },
        "skew": 0,
        "value": "CODE ** UNLICENSED accusoft.com",
        "valueAsByte": [
          67,
          79,
          68,
          69,
          32,
          42,
          42,
          32,
          85,
          78,
          76,
          73,
          67,
          69,
          78,
          83,
          69,
          68,
          32,
          97,
          99,
          99,
          117,
          115,
          111,
          102,
          116,
          46,
          99,
          111,
          109,
          0
        ],
        "type": "CODE39"
      },
      ...
    ]

_**NOTE:** Barcode Xpress runs in Watermark evaluation mode if started without
a license and the barcode value will be partially hidden. If you would like to
do a full-featured evaluation of the product, [contact us](mailto:info@accusoft.com)._
