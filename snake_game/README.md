# 🐍 Snake Game 📙

This is a simple Snake game implemented in Java using Swing. The game allows the player to control a snake to eat apples and grow in length, while avoiding collisions with the walls and itself.

![image](https://github.com/DoaaOsamaK/OOP-Java/assets/147305995/2d3d7c94-22aa-4986-b2b4-efbe2eb3af61)


## Table of Contents

- [📋 Getting Started](#getting-started)
- [🔧 Prerequisites](#prerequisites)
- [💾 Installation](#installation)
- [🚀 Running the Game](#running-the-game)
- [🎮 Gameplay](#gameplay)
- [🗂️ Project Structure](#project-structure)

## 📋 Getting Started

These instructions will help you set up and run the project on your local machine.

## 🔧 Prerequisites

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Any IDE that supports Java (e.g., [IntelliJ IDEA](https://www.jetbrains.com/idea/download/), [Eclipse](https://www.eclipse.org/downloads/))

## 💾 Installation

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/yourusername/snakegame.git
    ```

2. Navigate to the project directory:

    ```bash
    cd snakegame
    ```

3. Open the project in your preferred IDE.

## 🚀 Running the Game

1. Ensure that your IDE is configured to use the correct JDK.
2. Locate the `Board.java` and `Snake.java` files in the `src/code` directory.
3. Run the `Snake.java` file.

## 🎮 Gameplay

- Use the arrow keys to control the direction of the snake.
- The objective is to eat the apples that appear on the board. Each apple eaten increases the length of the snake.
- Avoid colliding with the walls or the snake's own body. The game ends when a collision occurs.
- The game is over when the snake collides with the wall or itself. A "Game Over" message will be displayed.

## 🗂️ Project Structure

<div>
snake_game<br>
├── resources<br>
│ ├── apple.png<br>
│ ├── dot.png<br>
│ └── head.png<br>
├── src<br>
│ └── code<br>
│ ├── Board.java<br>
│ └── Snake.java<br>
└── README.md
</div>
