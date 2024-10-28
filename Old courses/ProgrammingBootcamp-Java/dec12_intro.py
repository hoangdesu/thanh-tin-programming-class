# BMI calculator

# weight = 83 (kg)
# height = 1.75 (m)

# BMI = weight/height^2

# print BMI => 27.1

# print meaning => You are overweight

weight = float(input("Enter your weight: "))
height = float(input("Enter your height: "))

bmi = weight / (height ** 2)

bmi_type = ''

if bmi < 18.5:
    bmi_type = 'underweight'
elif bmi >= 18.5 and bmi < 25:
    bmi_type = 'normal'
elif bmi >= 25 and bmi < 30:
    bmi_type = 'overweight'
elif bmi >= 30 and bmi < 40:
    bmi_type = 'obese'
else:
    bmi_type = 'extremely obese'

print("Your BMI is", bmi, '. You are', bmi_type)


HW: 

Area calculator

- Triangle: input for height and base 
- Rectangle: width & height
- Square: width
- Circle: radius^2 * PI

Input the shape you want to calculate area for: "cube" => wrong shape => exit

Input the shape you want to calculate area for: "triangle"
Enter triangle's height: ...
Enter triangle's base: ...
=> Area of the triangle is ...

