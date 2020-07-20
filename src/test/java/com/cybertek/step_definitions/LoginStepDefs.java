package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("user1 is on the login page")
    public void user1_is_on_the_login_page() {
        System.out.println("->User is on the login page");
    }
    @When("user1 login as a librarian")
    public void user1_login_as_a_librarian() {
        System.out.println("->User logs in as librarian");
    }
    @Then("user1 should be able to see Dashboard page title")
    public void user1_should_be_able_to_see_dashboard_page_title() {
        System.out.println("->User should be able see dashboard page title");
    }

    @Given("user2 is on the log in page")
    public void user2_is_on_the_log_in_page() {
        System.out.println("->User2 is on the login page");
    }
    @When("user2 log in as a student")
    public void user2_log_in_as_a_student() {
        System.out.println("->User2 logs in as student");
    }
    @Then("user2 should be able to see Dashboard page title")
    public void user2_should_be_able_to_see_dashboard_page_title() {
        System.out.println("->User2 should be able see dashboard page title");
    }

    @Given("user3 is on the log in page")
    public void user3_is_on_the_log_in_page() {
        System.out.println("->User3 is on the login page");
    }
    @When("user3 log in as a admin")
    public void user3_log_in_as_a_admin() {
        System.out.println("->User3 logs in as admin");
    }

    @Then("user3 should be able to see Dashboard page title")
    public void user3_should_be_able_to_see_dashboard_page_title() {
        System.out.println("->User3 should be able see dashboard page title");
    }

}
