from __future__ import unicode_literals

from django.db import models
from django.contrib.auth.models import User

class UserInfo(models.Model):
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    usr_usp_id = models.ForeignKey('UserProfile', on_delete=models.CASCADE)
    usr_phone = models.CharField(max_length=50)
    usr_boss_id = models.ForeignKey('self', on_delete=models.CASCADE, null=True, blank=True)

    active_choices = (
        ('Y', 'Activo'),
        ('N', 'Inactivo'),
    )
    usr_active = models.CharField(max_length=1, choices=active_choices)

    class Meta:
        db_table = 'user_info'

class UserProfile(models.Model):
    usp_id = models.AutoField(primary_key=True)

    profile_choices = (
        ('DRIVER', 'Conductor de un camion'),
        ('ADMIN', 'Administrador de un grupo de camiones'),
    )
    usp_description = models.CharField(max_length=6, choices=profile_choices)

    class Meta:
        db_table = 'user_profile'
