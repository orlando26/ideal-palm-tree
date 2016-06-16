from django.contrib import admin
from .models import UserInfo, UserProfile

# Register your models here.
admin.site.register(UserInfo)
admin.site.register(UserProfile)
