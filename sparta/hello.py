import requests
from bs4 import BeautifulSoup

URL = "https://movie.daum.net/ranking/reservation"
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(URL, headers=headers)
soup = BeautifulSoup(data.text, 'html.parser')

lis = soup.select('#mainContent > div > div.box_ranking > ol > li')

for li in lis:
    rank = li.select_one('.rank_num').text
    title = li.select_one('.link_txt').text
    rate = li.select_one('.txt_grade').text
    print(rank,title,rate)