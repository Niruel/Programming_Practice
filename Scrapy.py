"""
Scraping app store
created By: Nicholas Ruppel
2019/12/06
"""

from bs4 import BeautifulSoup
import requests
from time import sleep







alpha_list =['A', 'B', 'C','D','E', 'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z']

#number = soup.find_all('ul', class_ = 'selected')

"""
pageNum =0
while pageNum<=102:
    for letter in alpha_list:
        Url = requests.get('https://apps.apple.com/jp/genre/ios-%E3%82%B2%E3%83%BC%E3%83%A0/id6014?letter='+letter+'&page='+str(pageNum)+'#page')

        soup = BeautifulSoup(Url.content, 'html.parser')
        clas = soup.find(class_='grid3-column')
        a=clas.find_all('a')
        for items in a:
            text=items.get_text().strip()

            specSheet(items.get('href'))
            #print(text)
    pageNum+=1
    #print(pageNum)
"""

def pageCounter():
    pageNum = 1
    pageValid = True
    foo = []
    while pageValid:
       
        Url = requests.get('https://apps.apple.com/jp/genre/ios-%E3%82%B2%E3%83%BC%E3%83%A0/id6014?letter=B&page='+str(pageNum)+'#page')
        soup = BeautifulSoup(Url.content, 'html.parser')
        pagnate =soup.find(class_='list paginate')
        a_tag=pagnate.find_all('a')
        
        for page in a_tag:
            
            respon =page.get_text().strip()
            foo.append(respon)
        
            
        print("page num",pageNum)
        if '次へ'  in foo:
           foo.remove('次へ')
        else:
            pageValid = False
        if pageValid:
            pageNum+=1
    
    
        
        
pageCounter()
sleep(2)