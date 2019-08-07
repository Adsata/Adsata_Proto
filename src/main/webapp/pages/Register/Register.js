/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on widgets/variables within this block */
Partial.onChange = function() {
    /*
     * variables can be accessed through 'Partial.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Partial.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Partial.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Partial.Widgets.username.datavalue'
     */
};


Partial.Variables.confirm_passwordChange = function($event, widget, newVal, oldVal) {

    Partial.Variables.Passowrd_Boolean.dataValue = false;

    Partial.Actions.Passwords_Missmatch.invoke({
        "message": "Please Enter the same password",
        "position": "center center"
    });
}


Partial.UserLiveForm1Beforeservicecall = function($event, $operation, $data, options) {

    if (Partial.Variables.Password_Boolean.dataValue == false) {

        return false

    }

}

Partial.UserLiveForm1_saveAction = function($event) {
    if (Partial.Variables.Password_Boolean.dataValue = true) {
        Partial.Widgets.UserLiveForm1.submit();
    }

};