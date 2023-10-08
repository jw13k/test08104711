import turtle

t = turtle.Turtle()
t.speed(0)


for _ in range(36):
    t.left(25)
    t.forward(100)  # 선 길이
    t.right(95)     # 95도 우회전

t.penup()
t.goto(85, -50)
t.pendown()


    
# 화면 유지
turtle.mainloop()

