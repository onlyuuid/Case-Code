"""
二. 基本数据类型
"""

# 1.基本数据类型
"""
    python中的变量不需要声明,每个变量使用前都必须赋值, 只有赋值后变量才会被创建.
    在python中变量就是变量, 没有类型, 我们所指的"类型"是变量所指内存中对象的类型.
    等号(=) 用来赋值
    等号(=) 运算符左边是变量名, 右边是存储在变量中的值: 如
"""
a = 10
b = 32.21
c = "hello"
print(a)
print(b)
print(c)

# 2.多个变量赋值
d = e = f = 3
print(d,e,f)
# 上面创建了一个整型对象, 值为3, 从右往左赋值, 三个变量被赋予了相同的值
# 也可以为多个对象指定多个值
g,h,i = 21,43,"hi"
print('g,h,i')
# 上面实例21,43按照位置分别分配给了g,h, hi分配给了i

# 3.标准数据类型
"""
    Python3中常见的数据类型有:
        Number (数字)
        String (字符串)
        bool   (布尔类型)
        List   (列表)
        Tuple  (元组)
        Set    (集合)
        Dictionary  (字典)
    Python3中六个标准数据类型中:
        不可变数据(3个): Number(数字), String(字符串), Tuple(元组)
        可变数据(3个):  List(列表), Dictionary(字典), Set(集合)
"""

# 4. Number(数字)
"""
    Python3支持 int, float, bool, complex(复数)
    在Python3中只有一种整数类型int, 表示为长整型, 没有Python2中的long类型
    想大多数语言一样, 数值类型的赋值和运算都很直观
    内置的type()函数可用用来查询变量所指的对象类型
"""
a = 12
b = "hello"
c = True
print(type(a))
print(type(b))
print(type(c))
"""
<class 'int'>
<class 'str'>
<class 'bool'>
"""
# 此外,还可以使用isinstance(a,int)来判断
d = isinstance(a,int)
print(d) # True
"""
    isinstance()和type()的区别:
        type()不会认为子类是一种父类类型
        isinstance()会认为子类是一种父类类型
"""
class A:
    print("这是一个父类")

class B(A):
    print("这是一个子类")

print(isinstance(A(),A))    # True
print(type(A()) == A)       # True
print(isinstance(B(),A))    # True
print(type(B()) == A)       # False
# 在Python3中bool是int类型的子类, True 和 False可以和数字进行相加, True为1,False为0, 相加为True, 但可以通过is来判断类型
result = issubclass(bool,int)
a = True == 1
b = False == 0
c = True + 3
d = False * 32

print(result)
print(a)
print(b)
print(c)
print(d)
#  Python2中没有bool类型, 它用数字0表示False, 用数子1表示True
#  当你指定一个值时, Number对象就会被创建
f = 10






















