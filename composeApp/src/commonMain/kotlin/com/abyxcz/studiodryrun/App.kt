package com.abyxcz.studiodryrun

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/** Builds a greeting for [name]; a blank name greets a stranger. */
fun greetingFor(name: String): String = if (name.isBlank()) "Hello, stranger!" else "Hello, $name!"

/** A greeting screen showing [greetingFor] for [name]. */
@Composable
fun GreetingScreen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = greetingFor(name),
        style = MaterialTheme.typography.headlineSmall,
        // Edge to edge on both platforms: keep content out of the status bar, notch/
        // Dynamic Island and gesture areas.
        modifier = modifier.safeDrawingPadding().padding(24.dp),
    )
}

/** The whole app's UI, shared by Android and iOS. */
@Composable
fun App(modifier: Modifier = Modifier) {
    MaterialTheme { Surface(modifier = modifier.fillMaxSize()) { GreetingScreen("Studio") } }
}
