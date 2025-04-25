<body>

<h1>Dynamic Color Scheme Generator</h1>

<p>This repository provides a utility for generating dynamic color schemes for Android apps using the Material You system. It allows you to generate color palettes dynamically based on a source color, with options for different themes, contrast levels, and platform specifications (Phone/Watch).</p>

<h2>Features</h2>
<ul>
    <li>Generates color palettes based on a single source color.</li>
    <li>Supports light and dark mode themes.</li>
    <li>Provides palettes for primary, secondary, tertiary, neutral, and error colors.</li>
    <li>Allows adjusting contrast levels (-1 to 1) for fine-grained control over the appearance of the generated colors.</li>
    <li>Supports both Phone and Watch platform types.</li>
</ul>

<h2>Installation</h2>
<ol>
    <li>Clone this repository:
        <pre><code>git clone https://github.com/your-username/dynamic-color-scheme.git</code></pre>
    </li>
    <li>Open the project in Android Studio or your preferred IDE.</li>
    <li>Build and run the project on your device or emulator.</li>
</ol>

<h2>Usage</h2>

<h3>Example Code</h3>
<p>Below is an example usage of the <code>DynamicScheme</code> class to generate color palettes:</p>

<pre><code>
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
</code></pre>

<h3>Available Color Attributes</h3>
<p>The following color attributes can be generated and accessed:</p>
<ul>
    <li>Primary</li>
    <li>Secondary</li>
    <li>Tertiary</li>
    <li>Neutral</li>
    <li>Neutral Variant</li>
    <li>Error</li>
    <li>Background</li>
    <li>Surface</li>
    <li>On Surface</li>
    <li>Surface Dim</li>
    <li>Surface Bright</li>
    <li>Surface Container</li>
    <li>Surface Container High</li>
    <li>Surface Container Highest</li>
    <li>Inverse Surface</li>
    <li>Outline</li>
    <li>Scrim</li>
    <li>Shadow</li>
    <li>Text Colors (e.g., Text Primary, Text Secondary)</li>
</ul>

<h2>Screenshot</h2>
<p>Below is a screenshot of the app's output:</p>
<img src="images/screenshot.png" alt="Screenshot" width="600">

<h2>License</h2>
<p>This project is licensed under the Apache License 2.0. See the <a href="LICENSE">LICENSE</a> file for more details.</p>

</body>
</html>
