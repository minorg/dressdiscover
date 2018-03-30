FROM microsoft/dotnet:2.0-sdk AS build
WORKDIR /app

# Copy csproj and restore as distinct layers
COPY *.sln .
COPY DressDiscover.Api/*.csproj ./DressDiscover.Api/
COPY DressDiscover.Lib/*.csproj ./DressDiscover.Lib/
COPY DressDiscover.Server/*.csproj ./DressDiscover.Server/
RUN dotnet restore

# Copy everything else and build app
COPY DressDiscover.Api/. ./DressDiscover.Api/
COPY DressDiscover.Lib/. ./DressDiscover.Lib/
COPY DressDiscover.Server/. ./DressDiscover.Server/
WORKDIR /app/DressDiscover.Server
RUN dotnet publish -o out /p:PublishWithAspNetCoreTargetManifest="false"

FROM microsoft/dotnet:2.0-runtime AS runtime
ENV ASPNETCORE_URLS http://+:80
WORKDIR /app
COPY --from=build /app/DressDiscover.Server/out ./
ENTRYPOINT ["dotnet", "DressDiscover.Server.dll"]
