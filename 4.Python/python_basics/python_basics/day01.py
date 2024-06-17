# 1.单行注释

# 2.打印语句
print("Hello World")

# 3.多行注释
'''
多行注释
'''
"""
多行注释
"""

# 4.行与缩进
#   缩进是python中的一大特点, 可以使用缩进来表示代码块, 不需要大括号{}来表示, 缩进的空格数是可以改变的, 但是同一代码块必须包含相同的缩进空格数.
b = True
if b:
    print("True")
else:
    print("False")
# print("end") 缩进不一样会导致报错

# 5.多行语句
#   python中通常都是一行写完一条语句, 但是如果语句太长,可以使用反斜杠\\来实现多行语句, 例如:
item_one = 1
item_two = 2
item_three = 3
total = item_one + \
        item_two + \
        item_three
print(total)
#   在[],{},()中不要使用 \, 如:
arr = ['1','2'
      ,'3','4'
      ,'5','6']





