# Dashboard Chart Generator

This project is a Java Swing application for creating various types of charts from CSV files. The charts include Bar Chart, Bar Chart 3D, Line Chart, Area Chart, Pie Chart, and Pie Chart 3D. It uses the JFreeChart library for rendering the charts.

## Features

- **Select CSV File:** Allows users to select a CSV file to generate charts.
- **Bar Chart:** Generates a bar chart from the selected CSV file.
- **Bar Chart 3D:** Generates a 3D bar chart.
- **Line Chart:** Generates a line chart.
- **Area Chart:** Generates an area chart.
- **Pie Chart:** Generates a pie chart.
- **Pie Chart 3D:** Generates a 3D pie chart.
- **Customizable Colors:** Allows users to set background and foreground colors for the charts.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- JFreeChart Library

## Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/dashboard-chart-generator.git
    cd dashboard-chart-generator
    ```

2. **Download JFreeChart:**
   Download the JFreeChart library from [here](https://sourceforge.net/projects/jfreechart/files/).

3. **Add JFreeChart to the project:**
   - In your IDE, add the JFreeChart jar files to the project's classpath.

## Usage

1. **Run the application:**
    - Open your IDE and run `DashBoard.java`.

2. **Select a CSV file:**
    - Click on "Select A File" button and choose your CSV file.

3. **Enter Chart Details:**
    - Enter the title, X-axis, and Y-axis names for your chart.

4. **Generate Chart:**
    - Choose the type of chart you want to generate by clicking the respective button.

5. **Customize Colors:**
    - Use the "Foreground Color" and "Background Color" buttons to customize the chart colors.

## CSV File Format

The CSV file should have two columns: the first column for the category (X-axis) and the second column for the value (Y-axis). Example:

```csv
Category,Value
A,10
B,20
C,30
D,40
