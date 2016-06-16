from django.shortcuts import render
from django.http import HttpResponseRedirect
from django.contrib import auth
from django.core.context_processors import csrf

# Create your views here.

def login_page(request):
    c = {}
    c.update(csrf(request))
    return render(request, 'login/login.html', c)

def validate(request):
    username = request.POST.get('username', '')
    password = request.POST.get('password', '')
    user = auth.authenticate(username=username, password=password)
    if user is not None:
        auth.login(request, user)
        return HttpResponseRedirect('/home/')
    else:
        return HttpResponseRedirect('/invalid/')

def home_page(request):
    return render(request, 'login/home.html', {'first_name': request.user.first_name,
        'last_name': request.user.last_name})

def invalid(request):
    c = {}
    c.update(csrf(request))
    c['error_msg'] = "Usuario y/o contrasenia incorrectos"
    return render(request, 'login/login.html', c)

def logout_view(request):
    auth.logout(request)
    return render(request, 'login/logout.html')
