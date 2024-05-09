## Employee Overview
- Select all tds that have money sign in them
  - hint Use contains()

//td[contains(text(), "$")]

- Get the first tr in the tbody
  - hint Use position

//tbody/tr[position() = 1]

- Get the last tr in the tbody
  - hint use last()

//tbody/tr[last()]


- Get All tds where the id is between 200 and 300
  - hint use logical operators and [@id]

//td[@id > 200 and @id < 300]

## Hi Score
- Get the li that conatins TIM's Dig Dug score
  - hint use 'and'

//li[contains(text(), "TIM") and contains(text(), "Dig")]

- Get the list items that belong to YVN or GAR

//li[contains(text(), "GAR") or contains(text(), "YVN")]

- Get the total amount of li in the document
  - hint use count

count(//li)
//ul[count(li)=8]

## Sales Report
- Select only the second table

//html/body/div[2]/table

- Select all trs where the attribute data-leader="Margaret"

//tr[@data-leader="Margaret"]

- Select all the tds containing the sales where Westview Middle was the troop
  - hint use parent

//td[contains(text(), "Middle")]

- Select the last tr of Thin Mints in the first half

//html/body/div[1]/table/tbody/tr[td[contains(text(),"Mints")]][last()]
