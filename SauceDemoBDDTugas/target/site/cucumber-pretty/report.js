$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Buying.feature");
formatter.feature({
  "line": 2,
  "name": "Buying",
  "description": "As a user I want to buy something in website sauce demo",
  "id": "buying",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Buying"
    }
  ]
});
formatter.before({
  "duration": 4834814500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Buying something",
  "description": "",
  "id": "buying;buying-something",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User already on website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User choosing items on sales page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User already on Your Cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User adjusting items in cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User already on checkout your information page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User input first name \"Andersen\" and last name \"Sebastian\" then the zip code \"59567\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User already on checkout overview page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User ready to checkout",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User finish checktout",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 385577800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 426768800,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 79413700,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.filterPageztoa()"
});
formatter.result({
  "duration": 427007500,
  "status": "passed"
});
formatter.match({
  "location": "YourCartSteps.verifyYourCartPage()"
});
formatter.result({
  "duration": 53275100,
  "status": "passed"
});
formatter.match({
  "location": "YourCartSteps.removingItem()"
});
formatter.result({
  "duration": 137587700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutYiSteps.verifyCheckoutYiPage()"
});
formatter.result({
  "duration": 33682700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Andersen",
      "offset": 23
    },
    {
      "val": "Sebastian",
      "offset": 48
    },
    {
      "val": "59567",
      "offset": 78
    }
  ],
  "location": "CheckoutYiSteps.inputCheckoutInfo(String,String,String)"
});
formatter.result({
  "duration": 340630600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOvrSteps.verifyCheckoutPage()"
});
formatter.result({
  "duration": 26148000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOvrSteps.finalCheckout()"
});
formatter.result({
  "duration": 66038000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutComSteps.verifyFinishCheckout()"
});
formatter.result({
  "duration": 26755500,
  "status": "passed"
});
formatter.after({
  "duration": 731945700,
  "status": "passed"
});
});