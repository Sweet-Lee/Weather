# 项目weather的说明文档
项目名称：天气预报APP

组        别：第四组

组        员：李田田、孔雨珊、戴叶

## 一、项目简介

​        科技的进步会给人们的生活带来方便和快捷，随着科技的发展,移动智能终端逐渐走进人们的视线,相关应用越来越广泛,并在人们的日常生活中扮演着越来越重要的角色。Android作为当前最流行的操作平台,自然也存在着大量的应用服务需求。此次我们的项目旨在开发一个天气预报app，在Android平台下天气软件的界面设计及异常处理部分,主要包括界面的实现、控件的使用、界面的布局和异常的处理等内容,将准确的天气情况以友好的方式呈现给用户,使用户可以更加赏心悦目地体验本软件的服务。

## 二、需求分析

​        在当代社会中,手机已经发展成为广大人们群众的日常生活中必不可少的通讯工具，而且,手机的功能也逐渐趋于完善。此软件是在现有手机的基础上,通过网络查询实现天气状况的报告和未来天气的预报等功能,让人们的出行和生活得到方便和保证。软件是一个获取天气的应用程序,启动程序后可以进行城市之间的选择的设置,并且可以通过图片、文字来显示当前和未来几天的天气情况,其中包括温度、风向和雨雪等情况。这些天气的数据是通过后台服务获取的,并从网上上获取天气的相关信息,将天气的信息保存在数据库中,方便用户的更新和查看。

## 三、分阶段设计

### 1.第一阶段——主界面设计

界面预览：![](C:\Users\KONG\Desktop\1.PNG)

代码预览：

| <？xml version = “ 1.0 ” encoding = “ utf-8 ”？> |                                                              |
| ------------------------------------------------ | ------------------------------------------------------------ |
|                                                  | < LinearLayout  xmlns ：android = “ http://schemas.android.com/apk/res/android ” |
|                                                  | xmlns ：tools = “ http://schemas.android.com/tools ”         |
|                                                  | android ：layout_width = “ match_parent ”                    |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：orientation = “ vertical ”                         |
|                                                  | android ：background = “ @ drawable / c ”                    |
|                                                  | tools ：context = “。 WeatherActivity ”                      |
|                                                  | >                                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ match_parent ”                    |
|                                                  | android ：layout_height = “ 50dp ”                           |
|                                                  | android ：background = “＃FF0000 ”                           |
|                                                  | android ：orientation = “ horizontal ”                       |
|                                                  | >                                                            |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_city ”                          |
|                                                  | android ：layout_width = “ 60dp ”                            |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：src = “ @ drawable / title_city ” />               |
|                                                  | < 查看                                                       |
|                                                  | android ：layout_width = “ 0.5dp ”                           |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：background = “＃000 ” />                           |
|                                                  | < TextView                                                   |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：text = “天气预报”                                  |
|                                                  | android ：textColor = “＃FFFFFF ”                            |
|                                                  | android ：textSize = “ 25sp ”                                |
|                                                  | android ：gravity = “ center ”                               |
|                                                  | android ：layout_marginLeft = “ 5dp ” />                     |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_location ”                      |
|                                                  | android ：layout_width = “ 50dp ”                            |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：src = “ @ drawable / location_city ”               |
|                                                  | android ：layout_marginLeft = “ 65dp ” />                    |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_share ”                         |
|                                                  | android ：layout_width = “ 50dp ”                            |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：src = “ @ drawable / title_share ” />              |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_update ”                        |
|                                                  | android ：layout_width = “ 50dp ”                            |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：src = “ @ drawable / title_update ” />             |
|                                                  |                                                              |
|                                                  | </ LinearLayout >                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ match_parent ”                    |
|                                                  | android ：layout_height = “ 170dp ”                          |
|                                                  | android ：orientation = “ horizontal ”                       |
|                                                  |                                                              |
|                                                  | >                                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ 150dp ”                          |
|                                                  | android ：orientation = “ vertical ” >                       |
|                                                  |                                                              |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_location ”                      |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “南京”                                      |
|                                                  | android ：textSize = “ 50sp ”                                |
|                                                  | android ：layout_marginTop = “ 10dp ”                        |
|                                                  | android ：layout_marginLeft = “ 15dp ”                       |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_time ”                          |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 20:21发布”                                |
|                                                  | android ：textSize = “ 20sp ”                                |
|                                                  | android ：layout_marginTop = “ 10dp ”                        |
|                                                  | android ：layout_marginLeft = “ 15dp ”                       |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_shidu ”                         |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “湿度：68％”                                |
|                                                  | android ：textSize = “ 20sp ”                                |
|                                                  | android ：layout_marginTop = “ 10dp ”                        |
|                                                  | android ：layout_marginLeft = “ 15dp ”                       |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  | />                                                           |
|                                                  | </ LinearLayout >                                            |
|                                                  | < RelativeLayout                                             |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | >                                                            |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_pm2.5 ”                         |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ PM2.5 ”                                   |
|                                                  | android ：textSize = “ 30sp ”                                |
|                                                  | android ：layout_marginTop = “ 25dp ”                        |
|                                                  | android ：layout_marginLeft = “ 100dp ”                      |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_wendu ”                         |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 25 ”                                      |
|                                                  | android ：textSize = “ 40sp ”                                |
|                                                  | android ：layout_below = “ @ id / tv_pm2.5 ”                 |
|                                                  | android ：layout_marginTop = “ 5dp ”                         |
|                                                  | android ：layout_marginLeft = “ 115dp ”                      |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  |                                                              |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_zhiliang ”                      |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “良”                                        |
|                                                  | android ：textSize = “ 60sp ”                                |
|                                                  | android ：layout_marginTop = “ 30dp ”                        |
|                                                  | android ：layout_marginLeft = “ 190dp ”                      |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | </ RelativeLayout >                                          |
|                                                  | </ LinearLayout >                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ match_parent ”                    |
|                                                  | android ：layout_height = “ 160dp ”                          |
|                                                  | android ：orientation = “ horizontal ” >                     |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_yun ”                           |
|                                                  | android ：layout_width = “ 150dp ”                           |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：src = “ @ drawable / weather_qing ” />             |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ match_parent ”                    |
|                                                  | android ：layout_height = “ match_parent ”                   |
|                                                  | android ：layout_marginLeft = “ 20dp ”                       |
|                                                  | android ：orientation = “ vertical ” >                       |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_time ”                      |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 6日星期四”                                |
|                                                  | android ：textSize = “ 25sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wendu ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 22℃~29℃ ”                                 |
|                                                  | android ：textSize = “ 25sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_type ”                      |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “阴”                                        |
|                                                  | android ：textSize = “ 25sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wind ”                      |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “风力3级”                                   |
|                                                  | android ：textSize = “ 25sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  |                                                              |
|                                                  | </ LinearLayout >                                            |
|                                                  |                                                              |
|                                                  | </ LinearLayout >                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ match_parent ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：orientation = “ horizontal ”                       |
|                                                  | android ：layout_marginTop = “ 20dp ”                        |
|                                                  | >                                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ 125dp ”                           |
|                                                  | android ：layout_height = “ 150dp ”                          |
|                                                  | android ：orientation = “ vertical ”                         |
|                                                  | android ：paddingLeft = “ 30dp ”                             |
|                                                  | >                                                            |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_time1 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 6日星期四”                                |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_yun1 ”                          |
|                                                  | android ：layout_width = “ 80dp ”                            |
|                                                  | android ：layout_height = “ 60dp ”                           |
|                                                  | android ：src = “ @ drawable / weather_qing ” />             |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wendu1 ”                    |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 22℃~29℃ ”                                 |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_type1 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “阴”                                        |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wind1 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “风力3级”                                   |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  |                                                              |
|                                                  |                                                              |
|                                                  | </ LinearLayout >                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ 125dp ”                           |
|                                                  | android ：layout_height = “ 150dp ”                          |
|                                                  | android ：orientation = “ vertical ”                         |
|                                                  | android ：paddingLeft = “ 30dp ” >                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_time2 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 6日星期四”                                |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_yun2 ”                          |
|                                                  | android ：layout_width = “ 80dp ”                            |
|                                                  | android ：layout_height = “ 60dp ”                           |
|                                                  | android ：src = “ @ drawable / weather_qing ” />             |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wendu2 ”                    |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 22℃~29℃ ”                                 |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_type2 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “阴”                                        |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wind2 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “风力3级”                                   |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  | />                                                           |
|                                                  | </ LinearLayout >                                            |
|                                                  | < LinearLayout                                               |
|                                                  | android ：layout_width = “ 125dp ”                           |
|                                                  | android ：layout_height = “ 150dp ”                          |
|                                                  | android ：orientation = “ vertical ”                         |
|                                                  | android ：paddingLeft = “ 30dp ” >                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_time3 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 6日星期四”                                |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < ImageView                                                  |
|                                                  | android ：id = “ @ + id / iv_yun3 ”                          |
|                                                  | android ：layout_width = “ 80dp ”                            |
|                                                  | android ：layout_height = “ 60dp ”                           |
|                                                  | android ：src = “ @ drawable / weather_qing ” />             |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wendu3 ”                    |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “ 22℃~29℃ ”                                 |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_type3 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “阴”                                        |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  |                                                              |
|                                                  | />                                                           |
|                                                  | < TextView                                                   |
|                                                  | android ：id = “ @ + id / tv_day_wind3 ”                     |
|                                                  | android ：layout_width = “ wrap_content ”                    |
|                                                  | android ：layout_height = “ wrap_content ”                   |
|                                                  | android ：text = “风力3级”                                   |
|                                                  | android ：textSize = “ 16sp ”                                |
|                                                  | android ：textColor = “＃ fff ”                              |
|                                                  | />                                                           |
|                                                  | </ LinearLayout >                                            |
|                                                  | </ LinearLayout >                                            |
|                                                  | </ LinearLayout >                                            |
