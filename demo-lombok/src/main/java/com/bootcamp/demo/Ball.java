package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Ball {
  private Color color;

  public static enum Color {
    RED, BLUE, BLACK
  }
  public static void main(String[] args) {

    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor());

    Ball ball2 = Ball.builder()
    .color(Color.BLACK)
    .build();
    System.out.println(ball2);
  }
}
