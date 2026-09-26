package com.abyxcz.studiodryrun

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

/** Entry point for the Swift shell (iosApp/Sources/ContentView.swift). */
@Suppress("FunctionName") // named for Swift: MainViewControllerKt.MainViewController()
fun MainViewController(): UIViewController = ComposeUIViewController { App() }
