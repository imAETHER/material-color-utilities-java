import blend.Blend;
import hct.Hct;
import scheme.SchemeTonalSpot;

import javax.swing.*;
import java.awt.*;

public class TestColor {
    public static void main(String[] args) {
        // Seed color in RGB format (example: Google blue)
        int seedColorInt = 0xFFFFFF; // Hex color value

        // Convert to HCT format
        Hct seedColorHct = Hct.fromInt(seedColorInt);

        // Set contrast level (0.0 for default contrast)
        double contrastLevel = 0.0;

        // Set dark mode (false for light mode)
        boolean isDarkMode = false;

        // Create a SchemeTonalSpot object based on the seed color
        SchemeTonalSpot dynamicScheme = new SchemeTonalSpot(seedColorHct, isDarkMode, contrastLevel);

        // Create a JFrame to display the colors
        JFrame frame = new JFrame("Generated Color Scheme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1)); // Grid layout to show multiple colors

        // Display all DynamicScheme colors
        displayColor(frame, "Primary", dynamicScheme.getPrimary());
        displayColor(frame, "On Primary", dynamicScheme.getOnPrimary());
        displayColor(frame, "Primary Container", dynamicScheme.getPrimaryContainer());
        displayColor(frame, "On Primary Container", dynamicScheme.getOnPrimaryContainer());
        displayColor(frame, "Inverse Primary", dynamicScheme.getInversePrimary());

        displayColor(frame, "Secondary", dynamicScheme.getSecondary());
        displayColor(frame, "On Secondary", dynamicScheme.getOnSecondary());
        displayColor(frame, "Secondary Container", dynamicScheme.getSecondaryContainer());
        displayColor(frame, "On Secondary Container", dynamicScheme.getOnSecondaryContainer());

        displayColor(frame, "Tertiary", dynamicScheme.getTertiary());
        displayColor(frame, "On Tertiary", dynamicScheme.getOnTertiary());
        displayColor(frame, "Tertiary Container", dynamicScheme.getTertiaryContainer());
        displayColor(frame, "On Tertiary Container", dynamicScheme.getOnTertiaryContainer());

        displayColor(frame, "Background", dynamicScheme.getBackground());
        displayColor(frame, "On Background", dynamicScheme.getOnBackground());
        displayColor(frame, "Surface", dynamicScheme.getSurface());
        displayColor(frame, "On Surface", dynamicScheme.getOnSurface());
        displayColor(frame, "Surface Variant", dynamicScheme.getSurfaceVariant());
        displayColor(frame, "On Surface Variant", dynamicScheme.getOnSurfaceVariant());
        displayColor(frame, "Surface Dim", dynamicScheme.getSurfaceDim());
        displayColor(frame, "Surface Bright", dynamicScheme.getSurfaceBright());

        displayColor(frame, "Surface Container Lowest", dynamicScheme.getSurfaceContainerLowest());
        displayColor(frame, "Surface Container Low", dynamicScheme.getSurfaceContainerLow());
        displayColor(frame, "Surface Container", dynamicScheme.getSurfaceContainer());
        displayColor(frame, "Surface Container High", dynamicScheme.getSurfaceContainerHigh());
        displayColor(frame, "Surface Container Highest", dynamicScheme.getSurfaceContainerHighest());

        displayColor(frame, "Inverse Surface", dynamicScheme.getInverseSurface());
        displayColor(frame, "Inverse On Surface", dynamicScheme.getInverseOnSurface());

        displayColor(frame, "Outline", dynamicScheme.getOutline());
        displayColor(frame, "Outline Variant", dynamicScheme.getOutlineVariant());

        displayColor(frame, "Shadow", dynamicScheme.getShadow());
        displayColor(frame, "Scrim", dynamicScheme.getScrim());
        displayColor(frame, "Surface Tint", dynamicScheme.getSurfaceTint());

        displayColor(frame, "Error", dynamicScheme.getError());
        displayColor(frame, "On Error", dynamicScheme.getOnError());
        displayColor(frame, "Error Container", dynamicScheme.getErrorContainer());
        displayColor(frame, "On Error Container", dynamicScheme.getOnErrorContainer());

        displayColor(frame, "Primary Fixed", dynamicScheme.getPrimaryFixed());
        displayColor(frame, "Primary Fixed Dim", dynamicScheme.getPrimaryFixedDim());
        displayColor(frame, "On Primary Fixed", dynamicScheme.getOnPrimaryFixed());
        displayColor(frame, "On Primary Fixed Variant", dynamicScheme.getOnPrimaryFixedVariant());

        displayColor(frame, "Secondary Fixed", dynamicScheme.getSecondaryFixed());
        displayColor(frame, "Secondary Fixed Dim", dynamicScheme.getSecondaryFixedDim());
        displayColor(frame, "On Secondary Fixed", dynamicScheme.getOnSecondaryFixed());
        displayColor(frame, "On Secondary Fixed Variant", dynamicScheme.getOnSecondaryFixedVariant());

        displayColor(frame, "Tertiary Fixed", dynamicScheme.getTertiaryFixed());
        displayColor(frame, "Tertiary Fixed Dim", dynamicScheme.getTertiaryFixedDim());
        displayColor(frame, "On Tertiary Fixed", dynamicScheme.getOnTertiaryFixed());
        displayColor(frame, "On Tertiary Fixed Variant", dynamicScheme.getOnTertiaryFixedVariant());

        displayColor(frame, "Control Activated", dynamicScheme.getControlActivated());
        displayColor(frame, "Control Normal", dynamicScheme.getControlNormal());
        displayColor(frame, "Control Highlight", dynamicScheme.getControlHighlight());

        displayColor(frame, "Text Primary Inverse", dynamicScheme.getTextPrimaryInverse());
        displayColor(frame, "Text Secondary And Tertiary Inverse", dynamicScheme.getTextSecondaryAndTertiaryInverse());
        displayColor(frame, "Text Primary Inverse Disable Only", dynamicScheme.getTextPrimaryInverseDisableOnly());
        displayColor(frame, "Text Secondary And Tertiary Inverse Disabled", dynamicScheme.getTextSecondaryAndTertiaryInverseDisabled());
        displayColor(frame, "Text Hint Inverse", dynamicScheme.getTextHintInverse());

        frame.pack();
        frame.setVisible(true);
    }

    // Helper method to create a colored panel
    private static void displayColor(JFrame frame, String label, int colorValue) {
        JPanel panel = new JPanel();
        Color color = new Color(colorValue);

        // Ensure label text is readable (adjust text color based on background color)
        JLabel colorLabel = new JLabel(label);
        colorLabel.setForeground(getTextColorForBackground(color)); // Adjust text color based on background

        panel.setBackground(color);
        panel.add(colorLabel);
        frame.add(panel);
    }

    // Method to determine if text should be light or dark based on background color
    private static Color getTextColorForBackground(Color background) {
        // Calculate luminance
        double luminance = (0.2126 * background.getRed() + 0.7152 * background.getGreen() + 0.0722 * background.getBlue()) / 255;
        // Return black text for light backgrounds, white text for dark backgrounds
        return luminance > 0.5 ? Color.BLACK : Color.WHITE;
    }
}