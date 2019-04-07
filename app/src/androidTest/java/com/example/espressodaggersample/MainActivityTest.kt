package com.example.espressodaggersample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.espressodaggersample.main.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityTestRule(
        MainActivity::class.java, false, false)

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testOnCreateShowHelloWorld() {
        activityRule.launchActivity(null)
        onView(withId(R.id.helloText)).check(matches(withText("Hello World!")))
    }

    @Test
    fun testClickHelloWorld() {
        activityRule.launchActivity(null)
        onView(withId(R.id.helloText)).perform(click())
        onView(withId(R.id.helloText)).check(matches(withText("clicked")))
    }
}