from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^$', views.login_page),
    url(r'^auth/$', views.validate),
    url(r'^home/$', views.home_page),
    url(r'^invalid/$', views.invalid),
    url(r'^logout/$', views.logout_view),
]
