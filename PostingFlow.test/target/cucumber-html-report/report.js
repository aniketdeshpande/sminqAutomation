$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('posting/test/CreatePost.feature');
formatter.feature({
  "line": 2,
  "name": "Posting Flow in Sminq Mobile App",
  "description": "As a user\nI should be able to click photos and post them with moods\nSo that I can publish my posts on my timeline",
  "id": "posting-flow-in-sminq-mobile-app",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Posting"
    },
    {
      "line": 1,
      "name": "@P1"
    }
  ]
});
formatter.scenario({
  "line": 33,
  "name": "Create a new Post",
  "description": "",
  "id": "posting-flow-in-sminq-mobile-app;create-a-new-post;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Posting"
    },
    {
      "line": 7,
      "name": "@TestCase-14"
    },
    {
      "line": 1,
      "name": "@P1"
    },
    {
      "line": 7,
      "name": "@Regression"
    },
    {
      "line": 7,
      "name": "@BVT"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the Sminq Mobile App is opened on \"local\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I allow \"Notification\" access",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I login with Google",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I allow \"Google Sign In\" access",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"saviant.sminq\" as username and \"Sminq@123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I allow \"Sminq Location\" access",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I allow \"iOS Location\" access",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on the camera icon to create a post",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I allow \"Sminq Camera\" access",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I allow \"iOS Camera\" access",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I allow \"Sminq Microphone\" access",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I allow \"iOS Microphone\" access",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click a photograph",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select the first location as \"My_Location\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select mood icon \"MEH\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on \"DONE\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"POST\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "the post should be added to the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "the location of the post should be \"My_Location\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "the mood of the post should be \"MEH\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "local",
      "offset": 35
    }
  ],
  "location": "PostFlowStepDef.the_Sminq_Mobile_App_is_open(String)"
});
formatter.result({
  "duration": 355843949204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notification",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 9866808097,
  "status": "passed"
});
formatter.match({
  "location": "PostFlowStepDef.I_login_with_Google()"
});
formatter.result({
  "duration": 11448430561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google Sign In",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 9636419544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "saviant.sminq",
      "offset": 9
    },
    {
      "val": "Sminq@123",
      "offset": 41
    }
  ],
  "location": "PostFlowStepDef.I_enter_as_username_and_as_password(String,String)"
});
formatter.result({
  "duration": 111357844987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sminq Location",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 24706940140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iOS Location",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 11169402509,
  "status": "passed"
});
formatter.match({
  "location": "PostFlowStepDef.the_home_page_is_displayed()"
});
formatter.result({
  "duration": 11630983777,
  "status": "passed"
});
formatter.match({
  "location": "PostFlowStepDef.I_click_on_the_camera_icon_to_create_a_post()"
});
formatter.result({
  "duration": 10684817947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sminq Camera",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 5828134320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iOS Camera",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 9677161854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sminq Microphone",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 6971275935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iOS Microphone",
      "offset": 9
    }
  ],
  "location": "PostFlowStepDef.I_allow_access(String)"
});
formatter.result({
  "duration": 9503269920,
  "status": "passed"
});
formatter.match({
  "location": "PostFlowStepDef.I_click_a_photograph()"
});
formatter.result({
  "duration": 14445238761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My_Location",
      "offset": 32
    }
  ],
  "location": "PostFlowStepDef.I_select_the_first_location_as(String)"
});
formatter.result({
  "duration": 36100157333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MEH",
      "offset": 20
    }
  ],
  "location": "PostFlowStepDef.I_select_mood_icon(String)"
});
formatter.result({
  "duration": 2765393528,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DONE",
      "offset": 12
    }
  ],
  "location": "PostFlowStepDef.I_click_on(String)"
});
formatter.result({
  "duration": 3144985836,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "POST",
      "offset": 12
    }
  ],
  "location": "PostFlowStepDef.I_click_on(String)"
});
formatter.result({
  "duration": 1962758432,
  "status": "passed"
});
formatter.match({
  "location": "PostFlowStepDef.the_post_should_be_added_to_the_home_page()"
});
formatter.result({
  "duration": 29733938483,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My_Location",
      "offset": 36
    }
  ],
  "location": "PostFlowStepDef.the_location_of_the_post_should_be(String)"
});
formatter.result({
  "duration": 6880421253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MEH",
      "offset": 32
    }
  ],
  "location": "PostFlowStepDef.the_mood_of_the_post_should_be(String)"
});
formatter.result({
  "duration": 7055225477,
  "status": "passed"
});
});