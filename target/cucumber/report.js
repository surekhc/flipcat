$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flip.feature");
formatter.feature({
  "line": 1,
  "name": "Flipcart Application",
  "description": "",
  "id": "flipcart-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 82,
  "name": "Sorting the Mobiles displayed based on high to low price",
  "description": "",
  "id": "flipcart-application;sorting-the-mobiles-displayed-based-on-high-to-low-price",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 81,
      "name": "@SortByLowPriceAndOrder"
    }
  ]
});
formatter.step({
  "line": 84,
  "name": "I launch flipcart login url",
  "keyword": "Given "
});
formatter.step({
  "line": 85,
  "name": "I input \u003cUserName\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "I press on login button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I search for the mobile brand as \u003cmobileBrand\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I click on low to high price sorting option",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I select the phone for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I enter the \u003cpincode\u003e for delivery",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "verify if the mobile is available to get shipped in the area",
  "keyword": "Then "
});
formatter.examples({
  "line": 93,
  "name": "",
  "description": "",
  "id": "flipcart-application;sorting-the-mobiles-displayed-based-on-high-to-low-price;",
  "rows": [
    {
      "cells": [
        "UserName",
        "password",
        "mobileBrand",
        "pincode"
      ],
      "line": 95,
      "id": "flipcart-application;sorting-the-mobiles-displayed-based-on-high-to-low-price;;1"
    },
    {
      "cells": [
        "6364444460",
        "Sridhar905",
        "pixel",
        "560076"
      ],
      "line": 96,
      "id": "flipcart-application;sorting-the-mobiles-displayed-based-on-high-to-low-price;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 96,
  "name": "Sorting the Mobiles displayed based on high to low price",
  "description": "",
  "id": "flipcart-application;sorting-the-mobiles-displayed-based-on-high-to-low-price;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 81,
      "name": "@SortByLowPriceAndOrder"
    }
  ]
});
formatter.step({
  "line": 84,
  "name": "I launch flipcart login url",
  "keyword": "Given "
});
formatter.step({
  "line": 85,
  "name": "I input 6364444460 and Sridhar905",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "I press on login button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I search for the mobile brand as pixel",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I click on low to high price sorting option",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I select the phone for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I enter the 560076 for delivery",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "verify if the mobile is available to get shipped in the area",
  "keyword": "Then "
});
formatter.match({
  "location": "flipTest.i_launch_flipcart_login_url()"
});
formatter.result({
  "duration": 3198723124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6364444460",
      "offset": 8
    },
    {
      "val": "Sridhar905",
      "offset": 23
    }
  ],
  "location": "flipTest.i_input_id_and(String,String)"
});
formatter.result({
  "duration": 260588168,
  "status": "passed"
});
formatter.match({
  "location": "flipTest.i_press_on_login_button()"
});
formatter.result({
  "duration": 59786796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pixel",
      "offset": 33
    }
  ],
  "location": "flipTest.i_search_for_the_mobile_brand_as(String)"
});
formatter.result({
  "duration": 2196996859,
  "status": "passed"
});
formatter.match({
  "location": "flipTest.click_on_low_to_high_price_sorting_option()"
});
formatter.result({
  "duration": 2135038404,
  "status": "passed"
});
formatter.match({
  "location": "flipTest.i_select_the_phone_for_purchase()"
});
formatter.result({
  "duration": 2156311516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "560076",
      "offset": 12
    }
  ],
  "location": "flipTest.i_enter_the_pincode_for_delivery(String)"
});
formatter.result({
  "duration": 4266357760,
  "status": "passed"
});
formatter.match({
  "location": "flipTest.verify_if_the_mobile_is_available_to_get_shipped_in_the_area()"
});
formatter.result({
  "duration": 31308404,
  "status": "passed"
});
});