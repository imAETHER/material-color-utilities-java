# Dynamic Color Scheme Generator

This repository provides a utility for generating dynamic color schemes for Android apps using the Material You system. It allows you to generate color palettes dynamically based on a source color, with options for different themes, contrast levels, and platform specifications (Phone/Watch).

## Features

- Generates color palettes based on a single source color.
- Supports light and dark mode themes.
- Provides palettes for primary, secondary, tertiary, neutral, and error colors.
- Allows adjusting contrast levels (-1 to 1) for fine-grained control over the appearance of the generated colors.
- Supports both Phone and Watch platform types.

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/dynamic-color-scheme.git
Open the project in Android Studio or your preferred IDE.

Build and run the project on your device or emulator.

Usage
Example Code
Below is an example usage of the DynamicScheme class to generate color palettes:

java
Copy
Edit
// Create a source color in HCT format
Hct sourceColorHct = Hct.from(0.5, 0.6, 0.7);  // Adjust the values as needed

// Define the color palettes
TonalPalette primaryPalette = new TonalPalette(...);  // Define your tonal palettes
TonalPalette secondaryPalette = new TonalPalette(...);
TonalPalette tertiaryPalette = new TonalPalette(...);
TonalPalette neutralPalette = new TonalPalette(...);
TonalPalette neutralVariantPalette = new TonalPalette(...);

// Create a DynamicScheme instance
DynamicScheme dynamicScheme = new DynamicScheme(
    sourceColorHct,
    Variant.DARK, // or Variant.LIGHT
    true,  // true for dark mode
    0.5,   // contrast level
    primaryPalette,
    secondaryPalette,
    tertiaryPalette,
    neutralPalette,
    neutralVariantPalette
);

// Display color palettes
System.out.println("Primary: " + dynamicScheme.getPrimary());
System.out.println("Secondary: " + dynamicScheme.getSecondary());
System.out.println("Background: " + dynamicScheme.getBackground());
System.out.println("Surface: " + dynamicScheme.getSurface());
System.out.println("On Surface: " + dynamicScheme.getOnSurface());
Available Color Attributes
The following color attributes can be generated and accessed:

Primary

Secondary

Tertiary

Neutral

Neutral Variant

Error

Background

Surface

On Surface

Surface Dim

Surface Bright

Surface Container

Surface Container High

Surface Container Highest

Inverse Surface

Outline

Scrim

Shadow

Text Colors (e.g., Text Primary, Text Secondary)

License
This project is licensed under the Apache License 2.0. See the LICENSE file for more details.






