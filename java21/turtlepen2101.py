import turtle

window = turtle.Screen()
window.title("마우스로 선 그리기")
window.bgcolor("white")

pen = turtle.Turtle()
pen.speed(0)  # 펜 속도 가장 빠름
pen.width(3)  # 선의 두께
pen.color("blue")

def draw_line(x, y):
    pen.goto(x, y)

window.onclick(draw_line)

turtle.done()
