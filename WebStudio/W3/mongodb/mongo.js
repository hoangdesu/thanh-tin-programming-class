Schema: định nghĩa cho data (data shape)

// let name = 'Tin' -> dynamic string

// age = 20 int

// String name = "Tín";

// int age = 20;

Student:
    - sid: str
    - name: str
    - birthday: str
    - major: str


    2018
student
{
    - sid: str
    - name: str
    - birthday: str
    - major: str
}


    2020: COVID
{
    - sid: str
    - name: str
    - birthday: str
    - major: str
    => vaccinated: boolean
    => đã bị covid hay chưa: boolean
    => ...
}


    2024: AI
{
    - sid: str
    - name: str
    - birthday: str
    - major: str
    => vaccinated: boolean
    => đã bị covid hay chưa: boolean
    => có sử dụng chatGPT hay ko: boolean
}

